package com.lhw.warranty.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Policyholder {
    private int policyholderId;//投保人id
    private String policyholderName;//投保人姓名
    private int paperId;//证件类型id
    private String paperNumber;//证件号码
    private String phone;//联系电话
    private String address;//联系地址
}
