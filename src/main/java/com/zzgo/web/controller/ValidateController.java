package com.zzgo.web.controller;

import cn.dsna.util.images.ValidateCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by 9527 on 2017/11/2.
 */
@Controller
public class ValidateController extends BaseController {
    /**
     * 验证码
     *
     * @throws IOException
     */
    @RequestMapping(value = "/validate")
    void validateCode(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        ValidateCode yanzheng = new ValidateCode(110, 25, 4, 5);
        String validateCode = yanzheng.getCode();
        HttpSession session = request.getSession();
        session.setAttribute("validate", validateCode.toLowerCase());
        yanzheng.write(response.getOutputStream());
    }
}
