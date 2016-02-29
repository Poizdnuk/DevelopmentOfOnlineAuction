package com.auction.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bids")
public class Bids {

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "item_id")
    private long item_id;

    @Column(name = "price")
    private double price;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;
}
