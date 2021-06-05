package com.ytl.insurance.controller;

import com.ytl.insurance.pojo.Warranty;
import com.ytl.insurance.service.WarrantyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/warranty")
public class WarrantyController {
    @Autowired
    private WarrantyService warrantyService;

    @PostMapping("/add")
    public String addWarranty(Warranty warranty){
        Warranty warranty1=warrantyService.addWarranty(warranty);
        if(warranty1 == null){
            return "添加失败";
        }
        return "添加成功！";
    }


    @GetMapping("/get")
    public List<Warranty> getWarranty(){
        return warrantyService.getWarranty();
    }
}
