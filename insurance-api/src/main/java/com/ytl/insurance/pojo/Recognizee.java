package com.ytl.insurance.pojo;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel("被保人实体类")
public class Recognizee {

    private int recognizeeId;
    private String recognizeeName;
    private int paper;
    private String paperNumber;
    private String phone;
    private String address;
    private String bank;
    private String bankAccount;
    private String driverId;
}
