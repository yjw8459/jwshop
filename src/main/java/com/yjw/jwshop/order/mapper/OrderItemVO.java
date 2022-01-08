package com.yjw.jwshop.order.mapper;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@IdClass(OrderItemPK.class)
@Table(name = "Order_items")
public class OrderItemVO {

    @Id
    @Column(name = "order_no")
    private Long orderNo;

    @Id
    @Column(name = "order_item_no")
    private Long orderItemNo;


    @Column(name = "order_count")
    private Long orderCount;

    @Column(name = "order_price")
    private Long orderPrice;

    @Column(name = "total_price")
    private Long totalPrice;

}
