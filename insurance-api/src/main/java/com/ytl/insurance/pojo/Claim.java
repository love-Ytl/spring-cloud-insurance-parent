package com.ytl.insurance.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel("赔案实体类")
public class Claim {

    private String claimMainId;
    private String caseReportId;
    private String warrantyId;
    private String filingTime;
    private String closeCaseTime;
    private int claimStatus;


}
