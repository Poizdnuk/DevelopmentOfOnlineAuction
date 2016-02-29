package com.auction.dao.message;

import com.auction.entity.Message;
import com.auction.entity.User;

import java.util.List;

public interface MessageDao {

    Message findById(Integer id);

    void saveMessage(Message user);

    void deleteMessageId(Integer id);

    List<Message> findAllMessages();

    Message findMessageByLogin(String login);
}
