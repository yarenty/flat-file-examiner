package com.yarenty.flatfile.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;


/**
 * POJO contains user details.
 * Created by yarenty on 12/07/2014.
 */
@Entity
@Table(name = "users")
public class User implements Serializable {

    private Integer id;
    private String login;
    private String pass;
    private String username;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String email;
    private boolean active;
    private Map<Integer, Task> actions; //keeps current active actions


    @Id
    @GeneratedValue
    @Column(name = "user_id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "login", nullable = false, length = 150)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "password", nullable = false, length = 150)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Column(name = "username", nullable = false, length = 150)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Map<Integer, Task> getActions() {
        return actions;
    }

    public void setActions(Map<Integer, Task> actions) {
        this.actions = actions;
    }

    public void addAction(Task action) {
        this.actions.put(action.getId(), action);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
