package com.yjw.jwshop.user.web.api;

import com.yjw.jwshop.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user/api")
public class UserApiController {
    private final UserService userService;

    @PostMapping("/login")
    public int login(@Valid UserApiVO userApiVO){
        return userService.loginProcess(userApiVO);
    }

    @PostMapping("/signUp")
    public int signUp(@Valid @RequestBody UserApiVO userApiVO){
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
