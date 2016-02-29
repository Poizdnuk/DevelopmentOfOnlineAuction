package com.auction.service.impl;

import com.auction.dao.user.UserDao;
import com.auction.entity.User;
import com.auction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findById(Integer id) {
        return userDao.findById(id);
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public void deleteUserByLogin(String login) {
        userDao.deleteUserByLogin(login);
    }

    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }

    public User findUserByLogin(String login) {
        return userDao.findUserByLogin(login);
    }
}
