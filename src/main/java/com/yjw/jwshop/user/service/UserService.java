package com.yjw.jwshop.user.service;

import com.yjw.jwshop.user.web.UserApiVO;

public interface UserService {
    public int loginProcess(UserApiVO userApiVO);

    public int signUp(UserApiVO userApiVO);

    public int duplicate(String id);
}
