package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTakleefReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTakleefSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTakleef;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface EmpTakleefRepo extends BaseRepository<EmpTakleef, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpTakleefSearchDto(" +
            "t.id, e.cardId, e.name, j.name, " +
            "t.hoursAvg, t.period, t.datBegin,t.place) " +
            "FROM EmpTakleef t " +
            "JOIN EmpTakleefDet td ON td.takleefId = t.id " +
            "JOIN Employee e ON td.empId = e.id " +
            "JOIN EmpJobs j ON e.jobId = j.id " +
            "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
            "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
            "AND (:place IS NULL OR t.place LIKE %:place%) " +
            "ORDER BY e.name")
    List<EmpTakleefSearchDto> searchOvertime(
            @Param("name") String name,
            @Param("cardId") String cardId,
            @Param("place") String place);

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpTakleefReportDto(" +
            "t.id, e.name, j.name, e.fia, t.place, t.task, t.period," +
            "t.hoursAvg, t.datBegin ) " +
            "FROM EmpTakleef t " +
            "JOIN EmpTakleefDet td ON td.takleefId = t.id " +
            "JOIN Employee e ON td.empId = e.id " +
            "JOIN EmpJobs j ON e.jobId = j.id " +
            "WHERE (:empId IS NULL OR e.id = :empId)" +
            "AND (:all = TRUE OR (t.datBeginGo BETWEEN :fromDate AND :toDate)) " +
            "ORDER BY t.id")
    List<EmpTakleefReportDto> reportOvertime(
            @Param("all") boolean all,
            @Param("empId") Long empId,
            @Param("fromDate") Date fromDate,
            @Param("toDate") Date toDate
    );
}
