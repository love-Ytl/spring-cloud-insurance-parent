package com.mzx.insurance.service.serviceimpl;

import com.mzx.insurance.mapper.DangerMapper;
import com.mzx.insurance.service.DangerService;
import com.ytl.insurance.pojo.Claim;
import com.ytl.insurance.pojo.Danger;
import com.ytl.insurance.pojo.Workflow;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class DangerServiceImmpl implements DangerService {

    @Resource
    private DangerMapper mapper;


    @Override
    public List<Danger> SelDanger() {
        return mapper.SelDanger();
    }

    @Override
    public int addDanger(Danger d) {
        Random r = new Random();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //报案id
        d.setCaseReportId("M"+r.nextInt(5000));
        d.setCaseReportTime(df.format(new Date()));
        int num = mapper.addDanger(d);
        Claim c = new Claim();
        //赔案id
        c.setClaimMainId("M"+r.nextInt(5000));
        //赔案与报案关联
        c.setCaseReportId(d.getCaseReportId());
        //保单id
        c.setWarrantyId(d.getWarrantyId());
        //报案时间
        c.setFilingTime(d.getCaseReportTime());

        int num2 = mapper.addclaim(c);


        return num2;
    }

    @Override
    public int addWorkflow(Workflow w) {
        return mapper.addWorkflow(w);
    }
}
