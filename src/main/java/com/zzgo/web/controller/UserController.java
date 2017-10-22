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
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    //用户信息添加页面
    @RequestMapping(value = "userinfo/tosave", method = {RequestMethod.GET})
    String userinfoTosave() {
        return "";
    }

    //用户信息添加
    @RequestMapping(value = "userinfo/save", method = {RequestMethod.POST})
    ModelAndView userinfoSave() {
        ModelAndView mv = getMv();
        return mv;
    }

    //用户注册账号页面
    @RequestMapping(value = "user/tosave", method = {RequestMethod.GET})
    String userTosave() {
        return "";
    }

    //用户注册账号
    @RequestMapping(value = "user/save", method = {RequestMethod.POST})
    ModelAndView userSave() {
        ModelAndView mv = getMv();
        return mv;
    }

    //用户删除
    @RequestMapping(value = "user/delete", method = {RequestMethod.GET})
    String userDelete() {
        return "redirect:user/list";
    }

    //用户信息修改页面
    //用户信息修改
    //用户修改账号页面
    //用户修改账号
    //查询单个用户
    //用户列表
    @RequestMapping(value = "user/list", method = {RequestMethod.POST})
    ModelAndView userList() {
        ModelAndView mv = getMv();
        return mv;
    }

}
