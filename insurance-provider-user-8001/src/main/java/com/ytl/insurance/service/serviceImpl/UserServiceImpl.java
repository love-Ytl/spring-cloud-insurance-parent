package com.ytl.insurance.service.serviceImpl;

import com.ytl.insurance.mapper.AuthorityMapper;
import com.ytl.insurance.mapper.UserMapper;
import com.ytl.insurance.pojo.Authority;
import com.ytl.insurance.pojo.User;
import com.ytl.insurance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserMapper mapper;
    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Resource
    private  AuthorityMapper authorityMapper;
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

}
