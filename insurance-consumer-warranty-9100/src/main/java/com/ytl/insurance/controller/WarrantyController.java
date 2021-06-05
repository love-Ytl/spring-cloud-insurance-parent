package com.ytl.insurance.controller;

import com.ytl.insurance.pojo.Warranty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/warranty")
public class WarrantyController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String URL_PREFIX="http://insurance-provider-warranty";

    @PostMapping("/addWarranty")
    public String addWarranty(Warranty warranty){
        return restTemplate.postForObject(URL_PREFIX+"/warranty/add",warranty,String.class);
    }

    @GetMapping("/getWarranty")
    public List<Warranty> getWarranty(){
        return restTemplate.getForObject(URL_PREFIX+"/warranty/get",List.class);
    }
}
