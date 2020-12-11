package com.tuto.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Product extends Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private Long Id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "BUY_PRICE")
    private Double buyPrice;

    @Column(name = "SELL_PRICE")
    private Double sellPrice;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

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

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public Category getCategory() {
        return category;
    }
}
