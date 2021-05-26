package com.mzx.insurance.service.serviceimpl;

import com.mzx.insurance.mapper.WarrantyMapper;
import com.mzx.insurance.service.WarrantyService;
import com.ytl.insurance.pojo.Warranty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WarrantyServiceImpl implements WarrantyService {

    @Resource
    private WarrantyMapper mapper;

    @Override
    public List<Warranty> SelWarranty() {
        List<Warranty> lsit = mapper.SelWarranty();
        return lsit;
    }

    @Override
    public int UpWarranty(Warranty w) {
        return mapper.UpWarranty(w);
    }

    @Override
    public Warranty SelSingle(String id) {
        return mapper.SelSingle(id);
    }
}
