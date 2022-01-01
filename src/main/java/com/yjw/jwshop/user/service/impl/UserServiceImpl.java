package com.yjw.jwshop.user.service.impl;

import com.yjw.jwshop.user.mapper.UserMapper;
import com.yjw.jwshop.user.mapper.UserVO;
import com.yjw.jwshop.user.service.UserService;
import com.yjw.jwshop.user.web.UserApiVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public int loginProcess(UserApiVO userApiVO) {

        return 0;
    }

    @Override
    public int signup(UserApiVO userApiVO){
        UserVO user = new UserVO(userApiVO);
        userMapper.save(user);
        return 0;
    }
}
