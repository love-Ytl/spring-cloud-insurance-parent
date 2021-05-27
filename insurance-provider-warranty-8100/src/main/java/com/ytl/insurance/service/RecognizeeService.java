package com.ytl.insurance.service;

import com.ytl.insurance.mapper.RecognizeeMapper;
import com.ytl.insurance.pojo.Recognizee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecognizeeService {
    @Resource
    private RecognizeeMapper mapper;
    /**
     * 增加被保人
     * @param recognizee
     * @return
     */
    public String addRecognizee(Recognizee recognizee){
        if(recognizee == null){
            return null;
        }

        int i = mapper.addRecognizee(recognizee);
        return i>0?"增加成功":"添加失败";
    }

    /**
     * 根据前端传递被保人id删除对应的记录
     * @param recognizeeId
     * @return
     */
    public String delRecognizee(int recognizeeId){
        if(recognizeeId == 0){
            return "删除失败";
        }

        int i = mapper.delRecognizee(recognizeeId);
        return i>0?"删除成功":"删除失败";
    }

    public String updateRecognizee(Recognizee recognizee){
        if(recognizee == null){
            return "修改失败,传入的值为空";
        }

        int i = mapper.updateRecognizee(recognizee) ;
        return i > 0? "修改成功":"修改失败";
    }


    public List<Recognizee> getRecognizee(){
        List<Recognizee>  list= mapper.getRecognizee();

        if(list == null){
            return null;
        }
        return list;
    }
}
