package com.ytl.insurance.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ApiModel("保单类型")
public class Role {
    private int roleId;//保单类型id
    private String roleName;//保单类型名
}
