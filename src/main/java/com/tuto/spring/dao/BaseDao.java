package com.tuto.spring.dao;

import org.hibernate.Session;

public interface BaseDao<E, K> {

    E persist(E entity);

    E merge(E entity);

    void delete(E entity);

    void delete(Class cl, Long id);

    E find(Class cl, Long id);

    Session getConnection();
}
