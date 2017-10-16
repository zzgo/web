package com.zzgo.web.controller;

import com.zzgo.web.model.User;
import com.zzgo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 9527 on 2017/10/12.
 */
@Controller
public class ControllerTest {
    @RequestMapping("/test")
    public void test() {
        System.out.println("test");
        System.out.println(111);
    }

    @Autowired
    private UserService userService;

    @RequestMapping("/mapper")
    public void testSaveUser2() throws Exception {
        User user = new User();
        userService.saveUser(user);
    }

    @RequestMapping("/index")
    public void index() throws Exception {
        System.out.println("index");
    }

}
