package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.model.entity.EmpServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpServicesRepo extends JpaRepository<EmpServices, Long> {

    List<EmpServices> findByEmpId(Long empId);

    @Query(value = "SELECT NVL(MAX(e.id), 0) + 1 FROM EmpServices e")
    Long getNextId();
}
