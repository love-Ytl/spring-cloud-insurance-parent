package com.ytl.insurance.controller;

import com.ytl.insurance.pojo.Policyholder;
import com.ytl.insurance.service.PolicyholderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policyholder")
public class PolicyholderController {
    private PolicyholderService policyholderService;
    @Autowired
    public void setPolicyholderService(PolicyholderService policyholderService) {
        this.policyholderService = policyholderService;
    }

    @PostMapping("/addPolicyholder")
    public String addPolicyholder(@RequestBody Policyholder policyholder){
        return policyholderService.addPolicyholder(policyholder);
    }


    @PostMapping("/delPolicyholder")
    public String delPolicyholder(@RequestBody int policyholderId){
        return policyholderService.delPolicyholder(policyholderId);
    }

    @PostMapping("/updatePolicyholder")
    public String updatePolicyholder(@RequestBody Policyholder policyholder){
        return policyholderService.updatePolicyholder(policyholder);
    }

    @GetMapping("/getPolicyholder")
    public List<Policyholder> getPolicyholder(){
        return policyholderService.getPolicyholder();
    }
}
