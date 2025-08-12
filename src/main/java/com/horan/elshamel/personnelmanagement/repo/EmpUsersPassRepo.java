package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.model.dto.response.UserPassResponseDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpUsersPass;
import com.horan.elshamel.personnelmanagement.model.entity.EmpUsersPassKey;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;


@Repository
public interface EmpUsersPassRepo extends JpaRepository<EmpUsersPass, EmpUsersPassKey> {

    @Query(value = "SELECT NVL(MAX(ID), 0) + 1 FROM EMP_USERS_PASS", nativeQuery = true)
    BigDecimal getNextId();

    List<EmpUsersPass> findAllByKeyId(BigDecimal id);

    @Transactional
    @Modifying
    @Query("DELETE FROM EmpUsersPass u WHERE u.key.id = :id")
    void deleteAllById(@Param("id") BigDecimal id);


    @Query("SELECT DISTINCT New com.horan.elshamel.personnelmanagement.model.dto.response.UserPassResponseDto(" +
           "e.key.id,e.name,e.pass,e.empName)" +
           "FROM EmpUsersPass e ORDER BY e.key.id ASC")
    List<UserPassResponseDto> findAllUsers();

}
