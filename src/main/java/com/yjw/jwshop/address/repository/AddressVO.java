package com.yjw.jwshop.address.repository;

import lombok.Getter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "address")
public class AddressVO {

    @EmbeddedId
    private AddressPK id;
}
