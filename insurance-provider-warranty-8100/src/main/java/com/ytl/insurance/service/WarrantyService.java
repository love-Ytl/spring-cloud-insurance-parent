package com.ytl.insurance.service;

import com.ytl.insurance.mapper.WarrantyMapper;
import com.ytl.insurance.pojo.Warranty;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class WarrantyService {
    @Resource
    private WarrantyMapper warrantyMapper;

    public Warranty addWarranty(Warranty warranty){
        if(warranty == null){
            return null;
        }
        LocalDate localDate=LocalDate.now();
        int year = localDate.getYear();
        int m=localDate.getMonthValue();
        int d=localDate.getDayOfMonth();
        int id = 1;
        String warrantyId = year + "" + m + "" + d + "000" + id ;
        warranty.setWarrantyId(warrantyId);
        Date date=new Date();
        warranty.setInsuranceBeginTime(date); //创建保单的日期
        Date date1 = new Date(date.getYear()+1 , date.getMonth(),date.getDay());
        warranty.setInsuranceEndTime(date1);

        int i = warrantyMapper.addWarranty(warranty);
        return warranty;
    }


    public List<Warranty> getWarranty(){
        List<Warranty> list = warrantyMapper.getWarranty();
        if(list == null){
            return null;
        }
        return list;
    }



}
