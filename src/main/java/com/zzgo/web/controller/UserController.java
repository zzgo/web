package com.zzgo.web.controller;

import com.zzgo.web.model.Page;
import com.zzgo.web.model.PageData;
import com.zzgo.web.model.User;
import com.zzgo.web.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * <P>用户信息管理（后台）</P>
 */
@Controller
@RequestMapping("admin/user")
public class UserController extends BaseController {
    private Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    //用户列表
    @RequestMapping(value = "/list")
    ModelAndView list(int pageNum) {
        ModelAndView mv = getMv();
        pageNum = pageNum < 1 ? 1 : pageNum;
        int count = userService.getCount();
        PageData pd = new PageData();
        pd.put("pageNum", (pageNum - 1) * TEN);
        pd.put("pageSize", TEN);
        List<User> results = userService.findByPage(pd);
        Page<User> page = new Page<User>(results, pageNum, TEN, count);
        return mv;
    }


    //用户注册账号页面(后台界面)
    @RequestMapping(value = "/tosave")
    String tosave() {
        return "admin/user/edit";
    }

    //用户注册账号（处理）
    @ResponseBody
    @RequestMapping(value = "/save")
    Map<String, Object> userSave(User user) {
        ModelAndView mv = getMv();
        userService.save(user);
        logger.info("##  用户保存成功");
        return ajaxSuccess();
    }

    //用户修改账号页面
    @RequestMapping(value = "/toedit")
    ModelAndView toedit(int id) {
        ModelAndView mv = getMv();
        User user = userService.findOne(id);
        mv.addObject("user", user);
        mv.setViewName("admin/user/edit");
        return mv;
    }

    //用户修改账号
    @ResponseBody
    @RequestMapping(value = "/edit")
    Map<String, Object> edit(User user) {
        ModelAndView mv = getMv();
        userService.update(user.getId(), user);
        logger.info("##  用户保存成功");
        return ajaxSuccess("保存成功！");
    }

    //用户删除
    @ResponseBody
    @RequestMapping(value = "/delete")
    Map<String, Object> userDelete(int userId) {
        userService.delete(userId);
        return ajaxSuccess("删除成功！");
    }

    //查询单个用户


}
