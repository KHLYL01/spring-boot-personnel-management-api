package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
