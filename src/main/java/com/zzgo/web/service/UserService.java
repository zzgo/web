package com.zzgo.web.service;

import com.zzgo.web.model.User;

import java.util.List;

/**
 * Created by 9527 on 2017/10/12.
 */
public interface UserService {
    //保存用户
    void save(User user);

    //删除用户
    void delete(int userId);

    //修改用户
    void update(int userId, User user);

    //查询用户，查询所有
    List<User> findAll();

    //扩展
}
