package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.model.entity.UserSignature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserSignatureRepo extends JpaRepository<UserSignature, Long> {
    List<UserSignature> findAllByUserId(Long userId);
}
