package com.ytl.insurance.pojo;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel("投保人实体类")
public class Policyholder {

    private int policyholderId;
    private String policyholderName;
    private int paperId;
    private String paperNumber;
    private String phone;
    private String address;
}
