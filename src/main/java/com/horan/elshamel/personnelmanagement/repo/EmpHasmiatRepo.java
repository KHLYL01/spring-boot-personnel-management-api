package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmiat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EmpHasmiatRepo extends BaseRepository<EmpHasmiat, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatSearchDto(" +
            "h.id, e.cardId, e.name, j.name, h.qrarId, h.datQrar) " +
            "FROM EmpHasmiat h " +
            "INNER JOIN EmpHasmDet hd ON hd.hasmId = h.id " +
            "INNER JOIN Employee e ON hd.empId = e.id " +
            "INNER JOIN EmpJobs j ON e.jobId = j.id " +
            "WHERE (:name IS NULL OR e.name LIKE %:name%) " +
            "AND (:cardId IS NULL OR e.cardId LIKE %:cardId%) " +
            "ORDER BY e.name")
    List<EmpHasmiatSearchDto> searchHasmiat(
            @Param("name") String name,
            @Param("cardId") String cardId);


    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatReportDto(" +
            "h.id, e.name, j.name, e.fia, h.qrarId, h.datQrar,hd.ghyab, hd.tagmee3, hd.gza) " +
            "FROM EmpHasmiat h " +
            "INNER JOIN EmpHasmDet hd ON hd.hasmId = h.id " +
            "INNER JOIN Employee e ON hd.empId = e.id " +
            "INNER JOIN EmpJobs j ON e.jobId = j.id " +
            "WHERE (:empId IS NULL OR e.id = :empId)" +
            "AND (:all = TRUE OR (h.datBeginGo BETWEEN :fromDate AND :toDate)) " +
            "ORDER BY h.id")
    List<EmpHasmiatReportDto> reportHasmiat(
            @Param("all") boolean all,
            @Param("empId") Long empId,
            @Param("fromDate") Date fromDate,
            @Param("toDate") Date toDate);


}
