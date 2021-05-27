package com.ytl.insurance.mapper;

import com.ytl.insurance.pojo.Policyholder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PolicyholderMapper {
    int addPolicyholder(Policyholder policyholder);

    int delPolicyholder(int policyholderId);

    int updatePolicyholder(Policyholder policyholder);

    List<Policyholder> getPolicyholder();
}
