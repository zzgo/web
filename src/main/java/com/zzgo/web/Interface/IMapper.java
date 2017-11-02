package com.zzgo.web.Interface;

import java.util.List;

/**
 * Created by 9527 on 2017/10/30.
 */
public interface IMapper<T> {
    void save(T t);

    void delete(int id);

    void update(T t);

    List<T> findAll();

    T findOne(int id);
}
