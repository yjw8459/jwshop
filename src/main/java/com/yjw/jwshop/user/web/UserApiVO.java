package com.yjw.jwshop.user.web;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class UserApiVO {

    @Size(min = 3, max = 20)
    private String id;

    @Size(min = 8, max = 20)
    private String password;

}
