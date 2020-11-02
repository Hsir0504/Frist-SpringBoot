package com.dragon.service;

import com.dragon.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface UserService {

    void post(User user);
    User login(String username);
}
