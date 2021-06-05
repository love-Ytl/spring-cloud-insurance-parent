package com.ytl.insurance.mapper;

import com.ytl.insurance.pojo.Warranty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarrantyMapper {
    int addWarranty(Warranty warranty);

    List<Warranty> getWarranty();
}
