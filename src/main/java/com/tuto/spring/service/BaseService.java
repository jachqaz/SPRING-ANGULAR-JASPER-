package com.tuto.spring.service;

import com.tuto.spring.model.Base;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service(value = "BaseService")
public interface BaseService {
    Base save(Base entity);

    void delete(Class cl, Long id);

    void delete(Base entity);

    Base find(Class cl, Long id);

    Session getConnection();
}
