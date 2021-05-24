package com.ytl.insurance.service.serviceImpl;

import com.ytl.insurance.mapper.UserMapper;
import com.ytl.insurance.pojo.User;
import com.ytl.insurance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper mapper;
    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String addUser(User user) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.withNano(0);
        user.setUserCreationTime(localDateTime);
        int i = mapper.addUser(user);
        return i>0?"添加成功":"添加失败";
    }
}
