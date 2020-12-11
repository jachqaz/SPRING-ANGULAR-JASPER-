package com.tuto.spring.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class Base {

    @Column(name = "CREATED_DATE")
    private Date createDate;

    public abstract Long getId();
}
