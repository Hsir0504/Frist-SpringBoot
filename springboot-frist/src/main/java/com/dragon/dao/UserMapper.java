package com.dragon.dao;

import com.dragon.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    //注册
    void post(User user);
    //登录
    User login(String username);
}
