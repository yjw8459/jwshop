package com.yjw.jwshop.order.mapper;

import com.yjw.jwshop.order.web.api.OrderApiVO;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
@Getter
@NoArgsConstructor
public class OrderVO {

    @Id
    @Column(name = "order_no")
    private Long orderNo;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "seq")
    private Long seq;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "price")
    private String price;

    public OrderVO(OrderApiVO orderApiVO){

    }
}
