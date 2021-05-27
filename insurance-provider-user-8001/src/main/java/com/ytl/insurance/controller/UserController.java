package com.ytl.insurance.controller;

import com.ytl.insurance.pojo.Authority;
import com.ytl.insurance.pojo.User;
import com.ytl.insurance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(User user){
        return userService.addUser(user);
    }

    @PostMapping("/toLogin")
    public String  queryUser(@RequestBody User user, HttpSession session){
        User user1 = userService.queryUser(user.getUserAccount(),user.getUserPwd());
        if(!(user1 ==null)){
            session.setAttribute("user",user1);
            return "登陆成功";
        }return "用户名或密码有误";
    }

    /*
     * 登录成功所获取用户
     */
    @GetMapping("/selUser")
    public List<User>  selUser(){
        return userService.selUser();
    }

}
