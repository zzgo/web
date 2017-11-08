package com.zzgo.web.mapper;

import com.zzgo.web.Interface.IMapper;
import com.zzgo.web.model.User;
import org.springframework.stereotype.Component;

/**
 * <p>用户mapper的定义数据库操作接口</p>
 * Created by 9527 on 2017/10/12.
 */
@Component
public interface UserMapper extends IMapper<User> {
    User findByName(String name);
}
