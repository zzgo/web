package com.zzgo.web.controller;

import com.zzgo.web.model.User;
import com.zzgo.web.service.UserService;
import com.zzgo.web.util.DateUtils;
import com.zzgo.web.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "save", method = {RequestMethod.GET, RequestMethod.POST})
    void save(User user, Model model) {
        user.setPassword(MD5Utils.getMD5(user.getPassword()));
        user.setCreateTime(DateUtils.getTimeStamp());
        user.setEmail("81509229@qq.com");
        user.setLastLoginTime(DateUtils.getTimeStamp());
        user.setLoginCount(1);
        user.setSex(0);
        user.setTel("18483600733");
        user.setLoginName("admin");
        userService.save(user);
        System.out.println("保存成功!");
    }
}
