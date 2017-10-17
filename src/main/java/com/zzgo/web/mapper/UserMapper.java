package com.zzgo.web.mapper;

import com.zzgo.web.model.User;

import java.util.List;

/**
 * <p>用户mapper的定义数据库操作接口</p>
 * Created by 9527 on 2017/10/12.
 */
public interface UserMapper {
    //保存用户
    void save(User user);

    //删除用户
    void delete(int userId);

    //修改用户
    void update(User user);

    //查询用户，查询所有
    List<User> findAll();

    //扩展
}
