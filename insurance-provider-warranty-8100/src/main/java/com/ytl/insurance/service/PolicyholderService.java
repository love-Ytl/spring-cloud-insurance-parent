package com.ytl.insurance.service;

import com.ytl.insurance.mapper.PolicyholderMapper;
import com.ytl.insurance.pojo.Policyholder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PolicyholderService {
    @Resource
    private PolicyholderMapper policyholderMapper;

    /**
     * 增加投保人
     * @param policyholder
     * @return
     */
    public String addPolicyholder(Policyholder policyholder){
        if(policyholder == null){
            return null;
        }
        int i=policyholderMapper.addPolicyholder(policyholder);
        return i>0?"增加成功":"添加失败";
    }

    /**
     * 根据前端传递投保人id删除对应的记录
     * @param policyholderId
     * @return
     */
    public String delPolicyholder(int policyholderId){
        if(policyholderId == 0){
            return "删除失败";
        }
        int i = policyholderMapper.delPolicyholder(policyholderId);
        return i>0?"删除成功":"删除失败";
    }

    /**
     * 根据数据修改对应的数据库记录
     * @param policyholder
     * @return
     */
    public String updatePolicyholder(Policyholder policyholder){
        if(policyholder == null){
            return "修改失败";
        }
        int i = policyholderMapper.updatePolicyholder(policyholder);
        return  i > 0? "修改成功":"修改失败";
    }

    public List<Policyholder> getPolicyholder(){
        List<Policyholder> list = policyholderMapper.getPolicyholder();
        if(list == null){
            return null;
        }
        return list;
    }
}
