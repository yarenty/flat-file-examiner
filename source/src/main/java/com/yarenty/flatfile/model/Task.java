package com.yarenty.flatfile.model;

import java.util.Date;
import java.util.List;

/**
 * Keeps information about all actions.
 * Created by yarenty on 12/07/2014.
 */
public class Task {

    private int id;
    private Date startDate; //when you start working on action
    private Date endDate; //when you finish working on action
    private Date dueDate; //when your action should be done
    private String title;
    private String description;
    private boolean deleted;
    private boolean active;
    private int priority = 100; //priority of displaying action
    private int timeSpent;

    private List<Comment> comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(int timeSpent) {
        this.timeSpent = timeSpent;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }


    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dueDate=" + dueDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
