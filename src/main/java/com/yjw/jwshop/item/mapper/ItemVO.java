package com.yjw.jwshop.item.mapper;

import com.yjw.jwshop.common.constraint.CATEGORIES;
import lombok.Getter;

import javax.persistence.*;

/**
 * 상품
 */
@Entity
@Getter
@Table(name = "item_list")
public class ItemVO {

    /**
     * 키 값 직접 할당의 경우는 @Id만 사용
     * @GeneratedValue : 자동 생성
     * GenerationType.IDENTITY : 데이터베이스에 위임(Auto_Increment)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemNo;

    @Column(name = "category")
    private CATEGORIES category;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "price")
    private String price;

    @Column(name = "item_hit")
    private String hit;

    @Column(name = "item_like")
    private String like;


}
