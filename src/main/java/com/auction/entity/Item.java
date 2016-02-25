package com.auction.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "item_id", length = 6, nullable = false)
    private long item_id;

    @Column
    private String name;

    @Column
    private Double price;

    @Column
    private Double lowPrice;

    @Column
    private Double actualPrice;

    @Column
    private String photo;

    @Column
    private LocalDate tervalStart;

    @Column
    private LocalDate intervalEnd;

    @Column
    private Category category_id;

    @Column
    private User seller;

    @Column
    private int status;

    @Column
    private int bidding;
}
