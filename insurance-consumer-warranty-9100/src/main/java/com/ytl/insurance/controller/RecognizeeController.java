package com.ytl.insurance.controller;

import com.ytl.insurance.pojo.Recognizee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/recognizee")
public class RecognizeeController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL_PREFIX="http://insurance-provider-warranty";

    @PostMapping("/add")
    public String add(Recognizee recognizee){
        return restTemplate.postForObject(URL_PREFIX+"/recognizee/add",recognizee,String.class);
    }

    @PostMapping("/del")
    public String del(int recognizeeId){
        return restTemplate.postForObject(URL_PREFIX+"/recognizee/del",recognizeeId,String.class);
    }

    @PostMapping("/update")
    public String update(Recognizee recognizee){
        return restTemplate.postForObject(URL_PREFIX+"/recognizee/update",recognizee,String.class);
    }

    @GetMapping("/get")
    public List<Recognizee> getPolicyholder(){
        return restTemplate.getForObject (URL_PREFIX+"/recognizee/get",List.class);
    }
}
