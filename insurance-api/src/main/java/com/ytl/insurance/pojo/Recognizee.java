package com.ytl.insurance.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("被保人实体")
public class Recognizee {
    private int recognizeeId;
    private String recognizeeName;

    @ApiModelProperty("证件类型")
    private int paper;
    private String paperNumber;
    private String phone;
    private String address;
    private String bank;
    private String bankAccount;
    @ApiModelProperty("驾驶证号码")
    private String driverId;
}
