package com.yarenty.flatfile.model;

import java.util.Date;

/**
 * At any time you can add some comment to your actions.
 * Created by yarenty on 12/07/2014.
 */
public class Comment {

    private int id;
    private Date date;
    private Integer userId;
    private String comment;
    private boolean deleted;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                ", userId=" + userId +
                '}';
    }
}
