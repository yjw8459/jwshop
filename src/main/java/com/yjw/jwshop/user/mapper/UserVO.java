package com.yjw.jwshop.user.mapper;

import com.yjw.jwshop.common.vo.constant.SEX;
import com.yjw.jwshop.user.web.UserApiVO;
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

    @Column(name = "mail")
    private String email;

    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private SEX sex;

    @Column(name = "in_date")
    private String date;

    @Column(name = "update_date")
    private String updateDate;

    public UserVO(UserApiVO userApiVO){
        id = userApiVO.getId();
        password = userApiVO.getPassword();
        date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        updateDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
    }

}
