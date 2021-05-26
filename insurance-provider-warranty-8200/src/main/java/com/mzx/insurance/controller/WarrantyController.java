package com.mzx.insurance.controller;

import com.mzx.insurance.service.WarrantyService;
import com.ytl.insurance.pojo.Warranty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Warranty")
public class WarrantyController {


    @Resource
    private WarrantyService warrantyService;

    @RequestMapping("/SelWarranty")
    public List<Warranty> SelWarranty(){
        return warrantyService.SelWarranty();
    }

    @RequestMapping("/SelSingle")
    public Warranty SelSingle(String id){
        return warrantyService.SelSingle(id);
    }

    @RequestMapping("/UpWarranty")
    public int UpWarranty(Warranty w){
        return warrantyService.UpWarranty(w);
    }

}
