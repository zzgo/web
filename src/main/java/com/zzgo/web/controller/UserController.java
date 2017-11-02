package com.zzgo.web.controller;

import com.zzgo.web.model.User;
import com.zzgo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    //用户信息添加页面
    @RequestMapping(value = "userinfo/tosave", method = {RequestMethod.GET})
    String userinfoTosave(int userId) {
        //TODO 查询用户
        userService.findOne(userId);
        return "";
    }

    //用户信息添加
    @RequestMapping(value = "userinfo/save", method = {RequestMethod.GET})
    ModelAndView userinfoSave(User user) {
        ModelAndView mv = getMv();
        userService.update(user.getId(), user);
        return mv;
    }

    //用户注册账号页面
    @RequestMapping(value = "user/tosave", method = {RequestMethod.GET})
    String userTosave() {
        return "";
    }

    //用户注册账号
    @RequestMapping(value = "user/save", method = {RequestMethod.GET})
    ModelAndView userSave() {
        ModelAndView mv = getMv();
        User user = new User();
        user.setName("admin");
        user.setPassword("admin");
        userService.save(user);
        System.out.println("##  保存成功");
        return mv;
    }

    //用户删除
    @RequestMapping(value = "user/delete", method = {RequestMethod.GET})
    String userDelete(int userId) {
        userService.delete(userId);
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
