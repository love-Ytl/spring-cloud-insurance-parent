package com.ytl.insurance.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 保单类型
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Risk {
    private  int warrantyTypeId;//保单类型id
    private String warramtyTypeName;//保单类型名称
}
