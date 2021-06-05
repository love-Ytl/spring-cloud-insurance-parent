package com.mzx.insurance.controller;

import com.mzx.insurance.service.DangerService;
import com.ytl.insurance.pojo.Danger;
import com.ytl.insurance.pojo.Workflow;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Danger")
public class DangerController {

    @Resource
    private DangerService dangerservice;

    @RequestMapping("/SelDanger")
    public List<Danger> SelWarranty(){
        return dangerservice.SelDanger();
    }

    @RequestMapping("/AddDanger")
    public int AddDanger(Danger d){
        return dangerservice.addDanger(d);
    }

    @RequestMapping("/AddWorkflow")
    public int addWorkflow(Workflow w){
        return dangerservice.addWorkflow(w);
    }
}
