package com.horan.elshamel.personnelmanagement.base;

import java.util.List;

public interface BaseService<ID, T> {

    List<T> findAll();

    T findById(ID id);

    T save(T dto);

    T update(ID id,T dto);

    void deleteById(ID id);

}
