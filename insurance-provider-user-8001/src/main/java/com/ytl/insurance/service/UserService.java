package com.ytl.insurance.service;

import com.ytl.insurance.pojo.Authority;
import com.ytl.insurance.pojo.User;

import java.util.List;

public interface UserService {
    public String addUser(User user);

    public User queryUser(String account,String pwd);
    List<Authority> getAuthority(int roleId);

    List<User> selUser();
}
