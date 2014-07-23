package com.yarenty.flatfile.dao;

import com.yarenty.flatfile.model.Task;

import java.util.List;

/**
 * Created by yarenty on 12/07/2014.
 */
public interface ActionDAO {

    void persistAction(Task action);

    Task getActionDetails(int actionId);

    List<Task> getActiveUserActions(int userId);
}
