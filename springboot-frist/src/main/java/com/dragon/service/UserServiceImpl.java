package com.dragon.service;

import com.dragon.dao.UserMapper;
import com.dragon.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;
@Transactional
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public void post(User user) {
        user.setId(UUID.randomUUID().toString());
        userMapper.post(user);
    }

    @Override
    public User login(String username) {
       return userMapper.login(username);
    }
}
