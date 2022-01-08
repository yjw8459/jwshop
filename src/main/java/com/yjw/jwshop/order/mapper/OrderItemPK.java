package com.yjw.jwshop.order.mapper;


import lombok.Data;

import java.io.Serializable;

@Data
public class OrderItemPK implements Serializable {

    private Long orderNo;

    private Long orderItemNo;

}
