package com.ytl.insurance.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface User {
    public int addUser(User user);
}
