package com.yarenty.flatfile.dao;

import com.yarenty.flatfile.model.Task;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by yarenty on 12/07/2014.
 */
@Repository
public class ActionDAOImpl implements ActionDAO {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public void persistAction(Task action) {
        entityManager.persist(action);
    }

    @Override
    public Task getActionDetails(int actionId) {
        return entityManager.find(Task.class, actionId);
    }


    @Override
    public List<Task> getActiveUserActions(int userId) {
        return entityManager.find(List.class, userId);
    }
}
