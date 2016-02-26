package com.auction.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "item_id", length = 6, nullable = false)
    private int item_id;

    @Column
    private String name;

    @Column
    private float price;

    @Column
    private float lowPrice;

    @Column
    private float actualPrice;

    @Column
    private String photo;

    @Column
    private Date itervalStart;

    @Column
    private Date intervalEnd;

    @Column
    private Category category_id;

    @Column
    private User seller;

    @Column
    private int status;

    @Column
    private int bidding;

    public Item() {
    }

}
