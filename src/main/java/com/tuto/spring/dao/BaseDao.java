package com.tuto.spring.dao;

import org.hibernate.Session;

import java.util.List;

public interface BaseDao<E, K> {

    E persist(E entity);

    E merge(E entity);

    void delete(E entity);

    void delete(Class cl, Long id);

    E find(Class cl, Long id);

    List<E> getAll(Class cl);

    Session getConnection();
}
