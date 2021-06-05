package com.ytl.insurance.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("保单实体类")
public class Warranty {
    private String warrantyId;
    private int policyholderId;
    private int recognizeeId;
    @ApiModelProperty("保单开始日期")
    private Date insuranceBeginTime;
    @ApiModelProperty("保单截止日期")
    private Date insuranceEndTime;
    @ApiModelProperty("投保金额")
    private double insureMoney;
    @ApiModelProperty("保单类型")
    private int warrantyTypeId;
    @ApiModelProperty("保单状态(1.正常 2.注销 3.退保)")
    private int warrantyState;
    @ApiModelProperty("保费金额")
    private double premiumMoney;
    private String vehicleName;
    private String vehicleColor;
    @ApiModelProperty("使用性质1.家庭自用汽车 2非营业客车 3营业客车")
    private int nature;
    @ApiModelProperty("车辆行驶证号码")
    private String sailNumber;
    @ApiModelProperty("车主")
    private String carOwnerName;
    @ApiModelProperty("新车价格")
    private double vpDollar;
    private String bankName;
    private String bankCard;
}
