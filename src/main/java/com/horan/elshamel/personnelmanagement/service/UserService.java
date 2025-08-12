package com.horan.elshamel.personnelmanagement.service;


import com.horan.elshamel.personnelmanagement.model.entity.User;
import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User save(User dto);

    void deleteById(Long id);

}
