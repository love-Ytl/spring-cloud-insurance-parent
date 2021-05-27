package com.ytl.insurance.service.serviceImpl;

import com.ytl.insurance.mapper.AuthorityMapper;
import com.ytl.insurance.mapper.UserMapper;
import com.ytl.insurance.pojo.Authority;
import com.ytl.insurance.pojo.User;
import com.ytl.insurance.service.UserService;
import com.ytl.insurance.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    private UserMapper mapper;
    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Resource
    private  AuthorityMapper authorityMapper;
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @Override
    public String addUser(User user) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.withNano(0);
        Date date = Date.from(Instant.parse(localDateTime.atZone(ZoneId.systemDefault()).toString()));
        user.setUserCreationTime(date);
        int i = mapper.addUser(user);
        return i>0?"添加成功":"添加失败";
    }

    @Override
    public User queryUser(String account,String pwd) {
        User userTo = new User();
        userTo.setUserAccount(account);
        userTo.setUserPwd(pwd);
        User userOut = mapper.queryUser(userTo);
        if(userOut != null){
            userOut.setAuthorities(getAuthority(userOut.getRoleId()));
            //将登陆的用户存入到redis中
            Map<String,Object> map=new HashMap<>();
            map.put(userOut.getUserAccount(),JsonUtils.objectToJson(userOut));
//            map.put("admin","user");
            System.out.println(JsonUtils.objectToJson(userOut));
            redisTemplate.opsForHash().putAll("user",map);
            return userOut;
        }
        return null;
    }

    @Override
    public  List<Authority> getAuthority(int roleId){
        //根据角色id获取所对应的父权限
        List<Authority> authorities=authorityMapper.getAuthoritesFather(roleId);
        System.out.println(authorities);
        //根据角色 和 父权限 获取该角色的二级菜单权限
        for (Authority authority : authorities) {
            List<Authority> authorityList = authorityMapper.getAuthorityByFather(authority.getAuthorityId(), roleId);
            authority.setChildren(authorityList);
        }
        return authorities;
    }

    @Override
    public List<User> selUser() {
        List<User> user=new ArrayList<>();
        String user1=redisTemplate.opsForHash().values("user").toString();
        user= JsonUtils.jsonToList(user1,User.class);
        return user;
    }

}
