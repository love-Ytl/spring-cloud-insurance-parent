package com.ytl.insurance.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("权限类")
public class Authority {
    private int authorityId;
    private String authorityName;
    private int authorityFather;
    private String authorityUrl;
    private List<Authority> children;
}
