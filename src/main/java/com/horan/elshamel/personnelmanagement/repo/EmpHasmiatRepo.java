package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmiat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

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


}
