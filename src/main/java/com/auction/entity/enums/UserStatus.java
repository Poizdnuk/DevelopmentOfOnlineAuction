package com.auction.entity.enums;

public enum UserStatus {
    USER("USER"),
    ADMIN("ADMIN");

    String userStatus;

    UserStatus(String userStatus){
        this.userStatus = userStatus;
    }

    public String getUserStatus() {
        return userStatus;
    }
}
