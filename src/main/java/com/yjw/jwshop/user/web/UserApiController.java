package com.yjw.jwshop.user.web;

import com.yjw.jwshop.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserApiController {
    private final UserService userService;

    @PostMapping("/login")
    public int login(UserApiVO userApiVO){
        return userService.loginProcess(userApiVO);
    }

}
