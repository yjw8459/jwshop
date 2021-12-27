package com.yjw.jwshop.common.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class TestVO {

    private String id;
    private String name;
    private String test;
    private int age;
    private String mail;
    private String price;
    private String inStock;

    public TestVO(String name, String test){
        this.name = name;
        this.test = test;
    }
}
