package com.auction.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "order_id", length = 6, nullable = false)
    private int order_id;

    @Column
    private User seller;

    @Column
    private User buyer;

    @Column
    private Item item;

    @Column
    private Date date;

    @Column
    private int status;

}
