package com.auction.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "user_id", length = 6, nullable = false)
    private int user_id;

    @Column(name = "login", length = 20)
    private String login;

    @Column(name = "user_first_name", length = 20)
    private String userFirstName;

    @Column(name = "user_last_name", length = 20)
    private String userLastName;

    @Column(name = "user_family_name", length = 20)
    private String userFamilyName;

    @Column(name = "address", length = 20)
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "history")
    private String history;

    @Column(name = "money")
    private long money;

}
