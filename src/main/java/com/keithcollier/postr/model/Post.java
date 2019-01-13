package com.keithcollier.postr.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post extends BaseEntity {

    @Column(name = "author_id")
    private String authorID;

    @Column(name = "message")
    private String message;

    @Column(name = "time_stamp")
    private Date timeStamp;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post() {
    }

    public Post(String authorID, String message, Date timeStamp, User user) {
        this.authorID = authorID;
        this.message = message;
        this.timeStamp = timeStamp;
        this.user = user;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public User getUser() {
        return user;
    }

    private void setUser(User user) {
        this.user = user;
    }

    public void setAuthorID() {
    }
}
