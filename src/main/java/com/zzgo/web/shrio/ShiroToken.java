package com.zzgo.web.shrio;

import org.apache.shiro.authc.UsernamePasswordToken;

import java.io.Serializable;

/**
 * Created by 9527 on 2017/9/20.
 * 自定义的Token
 */
public class ShiroToken extends UsernamePasswordToken implements Serializable {
    //继承UsernamePasswordToken目的是改变password的类型String ,原来是char[]
    private String loginPass;

    public ShiroToken(String username, String loginPass) {
        super(username, loginPass);
        this.loginPass = loginPass;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }
}
