package com.ytl.insurance.mapper;

import com.ytl.insurance.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public int addUser(User user);
}
