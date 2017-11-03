package com.zzgo.web.controller;

import com.zzgo.web.model.User;
import com.zzgo.web.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class UserController extends BaseController {
    private Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    //用户界面
    @RequestMapping(value = "{loginName}/page")
    ModelAndView self(@PathVariable("loginName") String loginName) {
        ModelAndView mv = getMv();
        User user = userService.findByName(loginName);
        mv.addObject("userinfo", user);
        mv.setViewName("admin/userinfo/main");
        return mv;
    }

    //用户信息添加页面
    @RequestMapping(value = "{loginName}/page", method = {RequestMethod.GET})
    ModelAndView userinfoTosave(@PathVariable("loginName") String loginName) {
        ModelAndView mv = getMv();
        User user = userService.findByName(loginName);
        mv.addObject("userinfo", user);
        mv.setViewName("admin/userinfo/userinfo");
        return mv;
    }

    //用户信息添加
    @RequestMapping(value = "userinfo/save", method = {RequestMethod.GET})
    ModelAndView userinfoSave(User user) {
        ModelAndView mv = getMv();
        userService.update(user.getId(), user);
        return mv;
    }

    //用户注册账号页面(后台界面)
    @RequestMapping(value = "user/tosave", method = {RequestMethod.GET})
    String userTosave() {
        return "";
    }

    //用户注册账号（处理）
    @ResponseBody
    @RequestMapping(value = "user/save", method = {RequestMethod.GET})
    Map<String, String> userSave(User user) {
        ModelAndView mv = getMv();
        System.out.println(getRequest().getSession().getAttribute("validate").toString());
        logger.info("##  用户保存成功");
        return ajaxSuccess();
    }

    //用户删除
    @RequestMapping(value = "user/delete", method = {RequestMethod.GET})
    String userDelete(int userId) {
        userService.delete(userId);
        return "redirect:/user/list";
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
