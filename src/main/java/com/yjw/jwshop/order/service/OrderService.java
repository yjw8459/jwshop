package com.yjw.jwshop.order.service;

import com.yjw.jwshop.order.mapper.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;


}
