package com.auction.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bids")
public class Bids {

    @Column(name = "user_id")
    private long user_id;

    @Column(name = "item_id")
    private long item_id;

    @Column(name = "price")
    private double price;

    @Column(name = "date")
    private LocalDate date;

}
