package com.yjw.jwshop.user.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class UserMapper {

    private final EntityManager entityManager;

    public int save(UserVO userVO){
        entityManager.persist(userVO);
        return 0;
    }

}
