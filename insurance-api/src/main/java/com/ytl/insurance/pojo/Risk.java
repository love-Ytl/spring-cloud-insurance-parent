package com.ytl.insurance.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("保单投保险别详细信息表")
public class Risk {
    private int riskId;
    private String warrantyId;
    private int riskTypeId;
    private Date operationTime;
}
