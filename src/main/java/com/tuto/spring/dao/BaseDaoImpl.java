package com.tuto.spring.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
public class BaseDaoImpl<E, K> implements BaseDao<E, K> {

    @Autowired
    private EntityManager entityManager;

    @Override
    public E persist(E entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public E merge(E entity) {
        entityManager.merge(entity);
        return entity;
    }

    @Transactional
    @Override
    public void delete(E entity) {
        if (entity != null) {
            entityManager.remove(entity);
        }
    }

    @Transactional
    @Override
    public void delete(Class cl, Long id) {
        this.delete(this.find(cl, id));
    }

    @Override
    public E find(Class cl, Long id) {
        return (E) entityManager.find(cl, id);
    }

    @Override
    public Session getConnection() {
        return entityManager.unwrap(Session.class);
    }
}
