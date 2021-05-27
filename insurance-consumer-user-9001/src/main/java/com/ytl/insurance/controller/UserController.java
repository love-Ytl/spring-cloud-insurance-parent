package com.ytl.insurance.controller;

import com.ytl.insurance.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/login")
public class UserController {
    private static final String URL_PREFIX="http://insurance-provider-user";

    private RestTemplate restTemplate;
    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * 用户登录
     * @param account 账号
     * @param pwd  密码
     * @return  登录成功或失败
     */
    @PostMapping("/toLogin")
    public String toLogin(String account,String pwd){
        System.out.println("account="+account);
        User user = new User();
        user.setUserAccount(account);
        user.setUserPwd(pwd);
        return restTemplate.postForObject(URL_PREFIX+"/user/toLogin",user,String.class);
    }

    /**
     *
     * @return  返回已经登录的用户信息
     */
    @GetMapping("/selUser")
    public List<User> getLoginUser(){
        return  restTemplate.getForObject(URL_PREFIX+"/user/selUser",List.class);
    }
}
