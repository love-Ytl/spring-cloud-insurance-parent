package com.ytl.insurance.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class riskType {
    private int riskTypeId;
    private String riskTypeName;
    @ApiModelProperty("期限")
    private int deadline;
    @ApiModelProperty("费用")
    private double riskCost;
    private String remark;
}
