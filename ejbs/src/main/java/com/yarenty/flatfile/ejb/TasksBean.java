package com.yarenty.flatfile.ejb;

import com.yarenty.flatfile.model.Task;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yarenty on 16/07/2014.
 */

@Stateless(mappedName = "tasksBeans")
@EJB(name = "java:global/MyTasks", beanInterface = Tasks.class)
public class TasksBean implements Tasks {

    @Override
    public List<Task> getTodayTasks() {
        List<Task> lt = new ArrayList<Task>();
        Task t = new Task();
        t.setId(1);
        t.setActive(true);
        t.setDescription("test task");
        lt.add(t);
        return lt;
    }
}
