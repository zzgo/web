package com.zzgo.web.controller;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    private ModelAndView mv = new ModelAndView();
    private Map<String, String> result = new HashMap<String, String>();

    public ModelAndView getMv() {
        return mv;
    }

    public void setMv(ModelAndView mv) {
        this.mv = mv;
    }

    public Map<String, String> getResult() {
        return result;
    }

    public void setResult(Map<String, String> result) {
        this.result = result;
    }

    //返回成功
    public Map<String, String> ajaxSuccess() {
        result.put("msg", "success");
        return result;
    }

    //返回失败
    public Map<String, String> ajaxFail() {
        result.put("msg", "fail");
        return result;
    }

    public HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
    }
}
