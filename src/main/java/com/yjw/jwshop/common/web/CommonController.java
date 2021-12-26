package com.yjw.jwshop.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/cmmn")
public class CommonController {

    @GetMapping
    public ModelAndView main(){
        return new ModelAndView("/cmmn/main");
    }

}
