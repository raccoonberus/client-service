package com.raccoonberus.clientService.dao;

public interface BaseCrudDao<T> {
    void create(T entity);

    T read(Object id);

    void update(T entity);

    void delete(T entity);

    T fint(Object id);
}
