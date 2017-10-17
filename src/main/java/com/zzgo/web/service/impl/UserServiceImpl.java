package com.zzgo.web.service.impl;

import com.zzgo.web.mapper.UserMapper;
import com.zzgo.web.model.User;
import com.zzgo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 9527 on 2017/10/12.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void save(User user) {
        userMapper.save(user);
    }

    public void delete(int userId) {
        userMapper.delete(userId);
    }

    public void update(int userId, User user) {
        user.setId(userId);
        userMapper.update(user);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
