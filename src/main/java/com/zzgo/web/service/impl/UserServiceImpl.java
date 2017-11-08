package com.zzgo.web.service.impl;

import com.zzgo.web.mapper.UserMapper;
import com.zzgo.web.model.PageData;
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

    public void delete(int id) {
        userMapper.delete(id);
    }

    public void update(int id, User user) {
        user.setId(id);
        userMapper.update(user);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public List<User> findByPage(PageData page) {
        return userMapper.findByPage(page);
    }

    public int getCount() {
        return userMapper.getCount();
    }

    public User findOne(int id) {
        return userMapper.findOne(id);
    }

    public User findByName(String name) {
        return userMapper.findByName(name);
    }
}
