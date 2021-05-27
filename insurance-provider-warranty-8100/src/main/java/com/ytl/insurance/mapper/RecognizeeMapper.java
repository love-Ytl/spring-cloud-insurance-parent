package com.ytl.insurance.mapper;

import com.ytl.insurance.pojo.Recognizee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RecognizeeMapper {

    int addRecognizee(Recognizee recognizee);

    int delRecognizee(int recognizeeId);

    int updateRecognizee(Recognizee recognizee);

    List<Recognizee> getRecognizee();
}
