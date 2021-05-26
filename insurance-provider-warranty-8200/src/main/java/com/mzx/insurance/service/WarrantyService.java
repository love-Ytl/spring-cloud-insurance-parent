package com.mzx.insurance.service;

import com.ytl.insurance.pojo.Warranty;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


public interface WarrantyService {
    //查询所有
    public List<Warranty> SelWarranty();

    //修改保单
    public int UpWarranty(Warranty w);

    //查询单个保单
    public Warranty SelSingle(String id);

}
