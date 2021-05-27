package com.ytl.insurance.controller;

import com.ytl.insurance.pojo.Policyholder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/policyholder")
public class PolicyholderController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String URL_PREFIX="http://insurance-provider-warranty";

    @PostMapping("/add")
    public String add(Policyholder policyholder){
        return restTemplate.postForObject(URL_PREFIX+"/policyholder/addPolicyholder",policyholder,String.class);
    }

    @PostMapping("/del")
    public String del(int policyholderId){
        return restTemplate.postForObject(URL_PREFIX+"/policyholder/delPolicyholder",policyholderId,String.class);
    }

    @PostMapping("/update")
    public String update(Policyholder policyholder){
        return restTemplate.postForObject(URL_PREFIX+"/policyholder/updatePolicyholder",policyholder,String.class);
    }

    @GetMapping("/get")
    public List<Policyholder> getPolicyholder(){
        return restTemplate.getForObject (URL_PREFIX+"/policyholder/getPolicyholder",List.class);
    }
}
