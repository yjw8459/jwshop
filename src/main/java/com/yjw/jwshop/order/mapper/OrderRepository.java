package com.yjw.jwshop.order.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public int order(OrderVO order){
        return 0;
    }
}
