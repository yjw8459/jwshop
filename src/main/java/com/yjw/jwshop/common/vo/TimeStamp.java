package com.yjw.jwshop.common.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable //내장될 객체
@Getter @Setter
public class TimeStamp {
    private String in_date;

    private String up_date;
}
