package com.liutao.service;

import com.liutao.mapper.UserMapper;
import com.liutao.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(String name){
        User user=userMapper.findUserInfo(name);
        return user;
    }

}
