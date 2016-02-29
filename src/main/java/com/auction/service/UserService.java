package com.auction.service;

import com.auction.entity.User;
import java.util.List;

public interface UserService {
    User findById(Integer id);

    void saveUser(User user);

    void deleteUserByLogin(String login);

    List<User> findAllUsers();

    User findUserByLogin(String login);
}
