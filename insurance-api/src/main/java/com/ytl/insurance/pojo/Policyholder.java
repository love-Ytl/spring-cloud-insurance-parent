package com.ytl.insurance.pojo;

/*
 * 投保人实体类
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Policyholder {

    private int policyholderId;
    private String policyholderName;
    private int paperId;
    private String paperNumber;
    private String phone;
    private String address;
}
