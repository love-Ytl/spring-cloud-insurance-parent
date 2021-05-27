package com.ytl.insurance.controller;

import com.ytl.insurance.pojo.Recognizee;
import com.ytl.insurance.service.RecognizeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recognizee")
public class RecognizeeController {
    @Autowired
    private RecognizeeService service;

    @PostMapping("/add")
    public String addRecognizee(@RequestBody Recognizee recognizee){
        return service.addRecognizee(recognizee);
    }

    @PostMapping("/del")
    public String delRecognizee( @RequestBody int recognizeeId){
        return service.delRecognizee(recognizeeId);
    }

    @PostMapping("/update")
    public String updateRecognizee(@RequestBody Recognizee recognizee){
        return service.updateRecognizee(recognizee);
    }

    @GetMapping("/get")
    public List<Recognizee> getRecognizee(){
        return service.getRecognizee();
    }
}
