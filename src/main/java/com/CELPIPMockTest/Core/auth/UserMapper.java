package com.CELPIPMockTest.Core.auth;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM \"user\" WHERE username = #{username}")
    User getUserByUsername(String username);

    @Select("SELECT * FROM \"user\" WHERE id = #{id}")
    User getUserById(Long id);
}
