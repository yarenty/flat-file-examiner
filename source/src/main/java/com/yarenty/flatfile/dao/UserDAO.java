package com.yarenty.flatfile.dao;

import com.yarenty.flatfile.dao.exception.UnknownUser;
import com.yarenty.flatfile.model.User;

/**
 * Created by yarenty on 12/07/2014.
 */
public interface UserDAO {

    User getUser(String login, String pass) throws UnknownUser;


}
