package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpKashfTepyReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpKashfTepySearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpKashfTepy;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EmpKashfTepyRepo extends BaseRepository<EmpKashfTepy, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpKashfTepySearchDto(" +
            "kt.id, e.cardId, e.name, j.name, " +
            "kt.requestDateString, kt.employeeStatus, kt.wehdaName) " +
            "FROM EmpKashfTepy kt " +
            "JOIN Employee e ON kt.empId = e.id " +
            "JOIN EmpJobs j ON e.jobId = j.id " +
            "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
            "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
            "AND (:empType IS NULL OR e.empType LIKE %:empType%)")
    List<EmpKashfTepySearchDto> searchKashfTepy(
            @Param("name") String name,
            @Param("cardId") String cardId,
            @Param("empType") String empType);

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpKashfTepyReportDto(" +
            "kt.id, e.name, j.name, kt.requestDateString, kt.wehdaType, " +
            "kt.wehdaName, kt.employeeStatus, kt.endDateString) " +
            "FROM EmpKashfTepy kt " +
            "JOIN Employee e ON kt.empId = e.id " +
            "JOIN EmpJobs j ON e.jobId = j.id " +
            "WHERE (:empId IS NULL OR e.id = :empId)" +
            "AND (:all = TRUE OR (kt.requestDate BETWEEN :fromDate AND :toDate)) " +
            "ORDER BY kt.id")
    List<EmpKashfTepyReportDto> reportKashfTepy(
            @Param("all") boolean all,
            @Param("empId") Long empId,
            @Param("fromDate") Date fromDate,
            @Param("toDate") Date toDate);

}
