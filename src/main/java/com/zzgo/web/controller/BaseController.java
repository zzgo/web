package com.zzgo.web.controller;

import org.springframework.web.servlet.ModelAndView;

public class BaseController {
    private ModelAndView mv = new ModelAndView();

    public ModelAndView getMv() {
        return mv;
    }

    public void setMv(ModelAndView mv) {
        this.mv = mv;
    }
}
