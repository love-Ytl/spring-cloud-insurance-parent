package com.ytl.insurance.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("保险类型")
public class WarrantyType {
    private int warrantyTypeId;
    private String warrantyTypeName;
}
