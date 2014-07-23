package com.yarenty.flatfile.ejb;

import com.yarenty.flatfile.model.Task;

import java.util.List;

/**
 * Created by yarenty on 16/07/2014.
 */
public interface Tasks {


    List<Task> getTodayTasks();
}
