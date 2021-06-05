package com.ytl.insurance.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel("工作流程实体类")
public class Workflow {

    private int workflowId;
    private int workflowPId;
    private String workflowName;
    private String claimMainId;
    private String assignedName;
    private String createTime;
    private String receiveTime;
    private String submitTime;
    private String transmitState;
    private String jobState;
    private String flowState;
}
