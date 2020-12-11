package com.tuto.spring.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.util.Date;

@MappedSuperclass
public abstract class Base {

    @Column(name = "CREATED_DATE")
    private Date createDate;

    @Transient
    private String error;

    public abstract Long getId();

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
