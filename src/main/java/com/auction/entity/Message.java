package com.auction.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "message_id", length = 12, nullable = false)
    private Integer message_id;

    @Column(name = "topic", length = 55)
    private String topic;

    @Column(name = "text")
    private String text;

    @Column(name = "from", length = 15)
    private User from;

    @Column(name = "to", length = 15)
    private User to;

    @Column(name = "item_id")
    private Integer item_id;

    @Temporal(TemporalType.DATE)
    @Column(name  = "date")
    private Date date;

    @Column (name  = "seen")
    private boolean seen;

    public Message() {
    }

    public Message(Date date, User from, Integer item_id,
                   boolean seen, String text, User to, String topic) {
        this.date = date;
        this.from = from;
        this.item_id = item_id;
        this.seen = seen;
        this.text = text;
        this.to = to;
        this.topic = topic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
