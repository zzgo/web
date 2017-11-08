package com.zzgo.web.controller;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    protected static final int TEN = 10;
    private ModelAndView mv = new ModelAndView();
    private Map<String, Object> responseResult = new HashMap<String, Object>();

    public ModelAndView getMv() {
        return mv;
    }

    public void setMv(ModelAndView mv) {
        this.mv = mv;
    }


    //返回成功
    public Map<String, Object> ajaxSuccess() {
        return ajaxSuccess("");
    }

    public Map<String, Object> ajaxSuccess(Object result) {
        responseResult.put("msg", "success");
        responseResult.put("code", 200);
        responseResult.put("responseResult", result);
        return responseResult;
    }

    //返回失败
    public Map<String, Object> ajaxFail() {
        responseResult.put("msg", "fail");
        responseResult.put("code", 400);
        return responseResult;
    }

    public HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
    }
}
