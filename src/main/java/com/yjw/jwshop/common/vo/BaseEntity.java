package com.yjw.jwshop.common.vo;

import com.yjw.jwshop.common.util.JwUtil;
import lombok.Getter;

import javax.persistence.*;

@Getter
@MappedSuperclass
public class BaseEntity {
    @Column(updatable = false)
    private String in_date;
    private String up_date;

    @PrePersist
    public void prePersist(){
        final String formatDate = JwUtil.getDate24Miss();
        in_date = formatDate;
        up_date = formatDate;
    }

    @PreUpdate
    public void preUpdate(){
        final String formatDate = JwUtil.getDate24Miss();
        up_date = formatDate;
    }

}
