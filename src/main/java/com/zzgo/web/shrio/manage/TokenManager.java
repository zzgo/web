package com.zzgo.web.shrio.manage;

import com.zzgo.web.model.User;
import com.zzgo.web.shrio.ShiroToken;
import org.apache.shiro.SecurityUtils;

/**
 * Created by 9527 on 2017/9/20.
 * shiro工具管理类
 */
public class TokenManager {
    /**
     * 登录验证
     *
     * @param user
     */
    public static User login(User user) {
        /**
         * WARN:注意user的密码是进行MD5加密处理的
         */
        return login(user, false);
    }

    /**
     * 登录验证
     *
     * @param user
     * @param remeberMe
     */
    public static User login(User user, Boolean remeberMe) {
        String username = user.getName();
        ShiroToken token = new ShiroToken(username, user.getPassword());
        /**
         * 是否记住
         */
        if (remeberMe)
            token.setRememberMe(true);
        /**
         *登录验证
         */
        SecurityUtils.getSubject().login(token);
        //返回用户
        return getToken();
    }

    /**
     * 获取token
     *
     * @return
     */
    public static User getToken() {
        User token = null;
        try {
            token = (User) SecurityUtils.getSubject().getPrincipal();
        } catch (Exception e) {
            System.out.println(SecurityUtils.getSubject().getPrincipal());
        }
        return token;
    }

    /**
     * 退出登录
     */
    public static void logout() {
        SecurityUtils.getSubject().logout();
    }

    public static boolean isLogin() {
        return null != SecurityUtils.getSubject().getPrincipal();
    }

}
