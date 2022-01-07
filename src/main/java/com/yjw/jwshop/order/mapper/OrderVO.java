package com.yjw.jwshop.order.mapper;

import com.yjw.jwshop.order.web.api.OrderApiVO;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "orders")
@Getter
public class OrderVO {

    @Id
    @Column(name = "order_no")
    private Long orderNo;

    private String memberId;

    private Long seq;

    private String orderDate;

    private String price;

    public OrderVO(OrderApiVO orderApiVO){

    }
}
