package com.yjw.jwshop.user.web;

import com.yjw.jwshop.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/login")
    public ModelAndView login(@RequestParam(value = "code", required = false) String code){
        return new ModelAndView("/user/login");
    }

    @GetMapping(value = "/signUp")
    public ModelAndView signUp(){
        return new ModelAndView("/user/sign_up");
    }

}
