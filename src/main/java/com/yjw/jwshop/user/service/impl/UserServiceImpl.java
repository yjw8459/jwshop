package com.yjw.jwshop.user.service.impl;

import com.yjw.jwshop.common.util.ContextUtil;
import com.yjw.jwshop.user.mapper.UserMapper;
import com.yjw.jwshop.user.mapper.UserVO;
import com.yjw.jwshop.user.service.UserService;
import com.yjw.jwshop.user.web.api.UserApiVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public int loginProcess(UserApiVO userApiVO) {
        UserVO user = userMapper.findOne(userApiVO.getId());
        if ( user == null )
            new IllegalArgumentException("회원 정보가 존재하지 않습니다.");
        ContextUtil.setSessionContext("userDataVO", user);
        return 1;
    }

    @Override
    @Transactional
    public int signUp(UserApiVO userApiVO){
        int result = 1;
        if ( duplicate(userApiVO.getId()) < 1 ) result = 0;
        UserVO user = new UserVO(userApiVO);
        userMapper.save(user);
        return result;
    }

    @Override
    public int duplicate(String id) {
        int result = 1;
        if ( userMapper.findOne(id) != null ){
            new IllegalArgumentException("중복된 아이디입니다.").printStackTrace();
            result = 0;
        }
        return result;
    }

}
