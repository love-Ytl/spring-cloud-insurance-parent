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
    @ApiModelProperty("ๆ้")
    private int deadline;
    @ApiModelProperty("่ดน็จ")
    private double riskCost;
    private String remark;
}
