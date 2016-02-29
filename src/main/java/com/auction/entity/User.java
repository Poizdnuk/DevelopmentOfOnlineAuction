package com.auction.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "user_id", length = 6, nullable = false)
    private Integer user_id;

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

    public User() {
    }

    public User(String address, String email, String history,
                String login, long money, String phone,
                String userFamilyName, String userFirstName,
                String userLastName) {
        this.address = address;
        this.email = email;
        this.history = history;
        this.login = login;
        this.money = money;
        this.phone = phone;
        this.userFamilyName = userFamilyName;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUserFamilyName() {
        return userFamilyName;
    }

    public void setUserFamilyName(String userFamilyName) {
        this.userFamilyName = userFamilyName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
}
