package com.ytl.insurance.pojo;

/**
 * 被保人实体类
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
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
