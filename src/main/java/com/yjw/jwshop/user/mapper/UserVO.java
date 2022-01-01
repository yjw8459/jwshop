package com.yjw.jwshop.user.mapper;

import com.yjw.jwshop.user.web.UserApiVO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
