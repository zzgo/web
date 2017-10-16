package com.zzgo.web.service.impl;

import com.zzgo.web.mapper.UserMapper;
import com.zzgo.web.model.User;
import com.zzgo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 9527 on 2017/10/12.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void saveUser(User user) {
        userMapper.saveUser(user);
    }
}
