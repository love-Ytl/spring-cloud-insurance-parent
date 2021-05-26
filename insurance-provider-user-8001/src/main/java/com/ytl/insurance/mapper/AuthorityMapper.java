package com.ytl.insurance.mapper;

import com.ytl.insurance.pojo.Authority;
import com.ytl.insurance.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AuthorityMapper {
    List<Authority> getAuthoritesFather(int  roleId);

    List<Authority>  getAuthorityByFather(@Param("authorityId") int authorityId, @Param("roleId") int roleId);

    List<Authority> getAuthority(int integer);
}
