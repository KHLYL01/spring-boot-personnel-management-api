package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmployeeFindDto;
import com.horan.elshamel.personnelmanagement.model.dto.EmployeeSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends BaseRepository<Employee, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmployeeSearchDto(" +
            "e.id, e.name, e.cardId,j.id, j.name, p.id, p.name, " +
            "e.fia, e.salary, e.draga, e.jobState, e.workJob) " +
            "FROM Employee e " +
            "JOIN EmpJobs j ON e.jobId = j.id " +
            "JOIN EmpParts p ON e.partId = p.id " +
            "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
            "AND (:id IS NULL OR e.id = :id) " +
            "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
            "AND (:jobId IS NULL OR j.id = :jobId) " +
            "AND (:partId IS NULL OR p.id = :partId) " +
            "AND (:fia IS NULL OR e.fia LIKE %:fia%) " +
            "AND (:draga IS NULL OR e.draga = :draga) " +
            "AND (:jobState IS NULL OR e.jobState = :jobState) " +
            "AND (:empType IS NULL OR e.empType LIKE %:empType%)")
    List<EmployeeSearchDto> searchEmployee(
            @Param("id") Long id,
            @Param("name") String name,
            @Param("cardId") String cardId,
            @Param("jobId") Long jobId,
            @Param("partId") Long partId,
            @Param("fia") String fia,
            @Param("draga") BigDecimal draga,
            @Param("jobState") String jobState,
            @Param("empType") String empType);


    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmployeeFindDto(" +
            "e.id, e.name, e.fia,e.draga,e.salary, e.naqlBadal, e.inEntedabBadal, e.empType, " +
            "e.badal1, e.badal2,e.badal3,e.badal4, e.jobbadalat, e.maeesha) " +
            "FROM Employee e " +
            "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
            "AND (:id IS NULL OR e.id = :id) " +
            "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
            "AND (:empType IS NULL OR e.empType LIKE %:empType%)")
    List<EmployeeFindDto> findEmployee(
            @Param("id") Long id,
            @Param("name") String name,
            @Param("cardId") String cardId,
            @Param("empType") String empType);



}
