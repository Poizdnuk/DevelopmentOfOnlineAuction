package com.auction.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "message_id", length = 6, nullable = false)
    private int message_id;

    @Column
    private String topic;

    @Column
    private String text;

    @Column
    private User from;

    @Column
    private User to;

    @Column(name = "item_id")
    private long item_id;

    @Column
    private LocalDate date;

    @Column
    private boolean seen;

}
