package com.yjw.jwshop.delivery.repository;

import com.yjw.jwshop.common.constraint.DeliveryStatus;
import com.yjw.jwshop.order.mapper.OrderItemPK;

import javax.persistence.*;

@Entity
@Table(name = "deliveries")
@IdClass(OrderItemPK.class)
public class DeliveryVO {

    @Id
    private Long orderNo;

    @Id
    private Long orderItemNo;

    @Column(name = "delivery_status")
    private DeliveryStatus deliveryStatus;

    @Column(name = "delivery_status_date")
    private String deliveryDate;

    @Column(name = "remark")
    private String remark;


}
