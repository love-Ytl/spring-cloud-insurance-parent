package com.mzx.insurance.mapper;

import com.ytl.insurance.pojo.Claim;
import com.ytl.insurance.pojo.Danger;
import com.ytl.insurance.pojo.Workflow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DangerMapper {

    //查询报案信息
    public List<Danger> SelDanger();

    //添加出险信息
    public int addDanger(Danger d);

    //同时添加关联表信息
    public int addclaim(Claim c);

    //添加工作流程
    public int addWorkflow(Workflow w);
}
