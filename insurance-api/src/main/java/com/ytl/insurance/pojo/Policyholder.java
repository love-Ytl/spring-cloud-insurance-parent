package com.ytl.insurance.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("投保人实体类")
public class Policyholder {
    private int policyholderId;
    private String policyholderName;
    @ApiModelProperty("证件类型Id")
    private int paperId;
    private String paperNumber;
    private String phone;
    private String address;
}
