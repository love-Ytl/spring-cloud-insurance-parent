package com.mzx.insurance.service;

import com.ytl.insurance.pojo.Danger;
import com.ytl.insurance.pojo.Workflow;

import java.util.List;

public interface DangerService {

    //查询报案信息
    public List<Danger> SelDanger();

    //添加报案信息
    public int addDanger(Danger d);

    //添加工作流程
    public int addWorkflow(Workflow w);

}
