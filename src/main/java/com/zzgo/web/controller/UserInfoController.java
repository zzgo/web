package com.zzgo.web.controller;

import com.zzgo.web.model.User;
import com.zzgo.web.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>用户信息管理</p>
 */
@Controller
@RequestMapping("userinfo")
public class UserInfoController extends BaseController {
    private Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;


    //用户界面
    @RequestMapping(value = "/{loginName}")
    ModelAndView self(@PathVariable("loginName") String loginName) {
        ModelAndView mv = getMv();
        mv.setViewName("prefix/userinfo/main");
        return mv;
    }

    //用户信息修改页面
    @RequestMapping(value = "{loginName}/editInfo", method = {RequestMethod.GET})
    ModelAndView editInfo(@PathVariable("loginName") String loginName) {
        //TODO 验证当前用户的用户名是否是自己的信息，如果不是则提示链接不存在
        ModelAndView mv = getMv();
        User user = userService.findByName(loginName);
        mv.addObject("userinfo", user);
        mv.setViewName("admin/user/info");
        return mv;
    }

    //用户信息修改后提交处理
    @RequestMapping(value = "{loginName}/edit", method = {RequestMethod.POST, RequestMethod.GET})
    ModelAndView edit(User user) {
        ModelAndView mv = getMv();
        userService.update(user.getId(), user);
        return mv;
    }

}
