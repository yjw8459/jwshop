package com.yjw.jwshop.address.repository;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class AddressPK implements Serializable {

    @Column(name = "memberId")
    private String memberId;

    @Column(name = "seq")
    private Long seq;
}
