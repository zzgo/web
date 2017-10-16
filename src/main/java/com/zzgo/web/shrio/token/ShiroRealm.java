package com.zzgo.web.shrio.token;

import com.zzgo.web.mapper.UserMapper;
import com.zzgo.web.model.User;
import com.zzgo.web.shrio.ShiroToken;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 9527 on 2017/9/18.
 */
public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserMapper userMapper;

    /**
     * 授权
     *
     * @param principalCollection
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //Long userId = Long.parseLong((String) getAvailablePrincipal(principalCollection));
        //User user = userDao.findOne(userId);
        //List<String> permissions = new ArrayList<String>();
        //List<Menu> menuList = user.getMenus();
        //for (Menu menu : menuList) {
        //    permissions.add(menu.getUrl());
        //}
        /** 实现授权 **/
        List<String> roles = new ArrayList<String>();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(roles);
        //装配权限到shiro
        return authorizationInfo;
    }

    /**
     * 验证
     *
     * @param authcToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws
            AuthenticationException {
        ShiroToken token = (ShiroToken) authcToken;
        User user = new User();
        user.setName("zhangsan");
        user.setPassword("123456");
        return new
                SimpleAuthenticationInfo(user, token.getLoginPass(), getName());
    }
}
