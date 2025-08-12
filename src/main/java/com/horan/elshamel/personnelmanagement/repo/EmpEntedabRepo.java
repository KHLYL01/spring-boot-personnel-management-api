package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpEntedabSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEntedab;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpEntedabRepo extends BaseRepository<EmpEntedab, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpEntedabSearchDto(" +
            "e.id, emp.cardId, emp.name, j.name, " +
            "e.place, e.period, e.datBegin) " +
            "FROM EmpEntedab e " +
            "JOIN EmpEntedabDet ed ON ed.entedabId = e.id " +
            "JOIN Employee emp ON ed.empId = emp.id " +
            "JOIN EmpJobs j ON emp.jobId = j.id " +
            "WHERE (:employeeName IS NULL OR emp.name LIKE %:employeeName%) " +
            "AND (:cardId IS NULL OR emp.cardId LIKE %:cardId%) " +
            "AND (:entedabPlace IS NULL OR e.place LIKE %:entedabPlace%)")
    List<EmpEntedabSearchDto> entedabSearch(
            @Param("employeeName") String employeeName,
            @Param("cardId") String cardId,
            @Param("entedabPlace") String entedabPlace
    );

}
