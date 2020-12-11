package com.tuto.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category extends Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    private Long Id;

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long getId() {
        return null;
    }

    public void setId(Long id) {
        Id = id;
    }
}
