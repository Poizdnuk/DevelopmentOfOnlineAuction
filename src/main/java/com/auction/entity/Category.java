package com.auction.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "category_id", length = 6, nullable = false)
    private int category_id;

    @Column(name = "name", length = 15)
    private String name;

    @Column(name = "description")
    private String description;

    public Category() {
    }

    public Category(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
