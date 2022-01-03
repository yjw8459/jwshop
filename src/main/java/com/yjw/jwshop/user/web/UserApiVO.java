package com.yjw.jwshop.user.web;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class UserApiVO {

    @NotEmpty
    @Size(min = 3, max = 20)
    private String id;

    @NotEmpty
    @Size(min = 8, max = 20)
    private String password;

    @Size(min = 8, max = 20)
    @Email
    private String email;

    private String sex;
}
