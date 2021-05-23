package com.ytl.insurance.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Job {
    private int jobId;
    private String jobName;
    private Double jobMoney;
}
