package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpEntedabReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpEntedabSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEntedab;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
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

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpEntedabReportDto(" +
            "e.id, emp.name, j.name,emp.fia, e.place, e.task, e.period, e.datBegin, " +
            "emp.id, e.datBeginGo) " +
            "FROM EmpEntedab e " +
            "INNER JOIN EmpEntedabDet ed ON ed.entedabId = e.id " +
            "INNER JOIN Employee emp ON ed.empId = emp.id " +
            "INNER JOIN EmpJobs j ON emp.jobId = j.id " +
            "WHERE (:empId IS NULL OR emp.id = :empId)" +
            "AND e.datBeginGo BETWEEN :fromDate AND :toDate " +
            "ORDER BY emp.id,e.datBeginGo")
    List<EmpEntedabReportDto> entedabReport(
            @Param("empId") Long empId,
            @Param("fromDate") Date fromDate,
            @Param("toDate") Date toDate
    );

    @Query("SELECT COALESCE(SUM(e.period),0) FROM EmpEntedab e " +
            "INNER JOIN EmpEntedabDet ed ON ed.entedabId = e.id " +
            "WHERE ed.empId = :empId " +
            "AND e.datBeginGo < :datBeginGo " +
            "AND e.datBeginGo >= :fromDate"
    )
    Long sumPeriod( @Param("empId") Long empId, @Param("fromDate") Date fromDate, @Param("datBeginGo") Date datBeginGo);

}
