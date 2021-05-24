package com.lhw.warranty.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 保单信息表
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Warranty {
    private String warrantyid;//保单id
    private int policyholderId;//投保人
    private int recognizeeId;//被保人
    private Date insuranceBeginTime;//保险开始日期
    private Date insuranceEndTime;//保险截至日期
    private double insureMoney;//投保金额
    private int warrantyTypeId;//保单类型
    private  int warrantyState;//保单状态
    private double premiumMoney;//保险金额
    private String vihicleName;//车辆名称
    private String vihicleColor;//车辆颜色
    private int nature;//使用性质
    private String sailNumber;//车辆行驶证号码
    private  String carOwnerName;//车主姓名
    private  double vpDollar;//新车购置价
    private  String bankName;//银行名称
    private String bankCard;//银行账号

}
