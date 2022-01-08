package com.yjw.jwshop.user.mapper;

import com.yjw.jwshop.common.constraint.GRADE;
import com.yjw.jwshop.common.vo.TimeStamp;
import com.yjw.jwshop.common.vo.constant.SEX;
import com.yjw.jwshop.user.web.api.UserApiVO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "member")
@Getter
@Setter
@NoArgsConstructor
public class UserVO {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;


    @Column(name = "mail")
    private String email;

    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private SEX sex;

    @Column(name = "member_grade")
    private GRADE grade;

    @Column(name = "sign_up_date")
    private String signUpDate;

    @Embedded
    private TimeStamp timeStamp;

    public UserVO(UserApiVO userApiVO){
        id = userApiVO.getId();
        password = userApiVO.getPassword();
    }

}
