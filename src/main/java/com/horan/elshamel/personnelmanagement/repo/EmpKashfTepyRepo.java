package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmpKashfTepySearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpKashfTepy;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpKashfTepyRepo extends BaseRepository<EmpKashfTepy, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmpKashfTepySearchDto(" +
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

}
