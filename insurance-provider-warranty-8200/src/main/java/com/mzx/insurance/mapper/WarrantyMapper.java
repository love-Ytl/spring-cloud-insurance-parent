package com.mzx.insurance.mapper;

import com.ytl.insurance.pojo.Warranty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarrantyMapper {

    //查询所有
    public List<Warranty> SelWarranty();

    //修改保单
    public int UpWarranty(Warranty w);

    //查询单个保单
    public Warranty SelSingle(String id);


}
