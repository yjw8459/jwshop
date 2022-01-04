package com.yjw.jwshop.user.web;

import com.yjw.jwshop.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user/api")
public class UserApiController {
    private final UserService userService;

    @PostMapping("/login")
    public int login(UserApiVO userApiVO){
        return userService.loginProcess(userApiVO);
    }

    @PostMapping("/signUp")
    public int signUp(@RequestBody UserApiVO userApiVO){
        return userService.signUp(userApiVO);
    }

    /**
     * 아이디 중복체크
     * @return
     */
    @PostMapping("/duplicate")
    public int duplicate(@RequestBody String id){
        return userService.duplicate(id);
    }

}
