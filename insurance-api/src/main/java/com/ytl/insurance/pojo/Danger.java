package com.ytl.insurance.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel("报案信息实体类")
public class Danger {
    private String caseReportId;
    private String province;
    private String city;
    private String county;
    private String fullAddress;
    private String warrantyId;
    private String dangerPass;
    private String dangerCause;
    private String driver;
    private String driverTel;
    private String reportPerson;
    private String reportPersonTel;
    private String caseReportTime;
}
