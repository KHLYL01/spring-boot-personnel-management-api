package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmpHasmiatDetDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmDet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpHasmDetRepo extends BaseRepository<EmpHasmDet, Long> {

    @Query(value = "SELECT NVL(MAX(e.maxId), 0) + 1 FROM EmpHasmDet e")
    Long getNextId();

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmpHasmiatDetDto(" +
            "hd.maxId, e.name, e.salary, e.naqlBadal,hd.ghyab, " +
            "hd.tagmee3,hd.min,hd.gza,hd.notes ) " +
            "FROM EmpHasmDet hd " +
            "JOIN Employee e ON hd.empId = e.id " +
            "WHERE hd.hasmId = :hasmiatId "+
            "ORDER BY e.name")
    List<EmpHasmiatDetDto> getHasmiatDetByHasmiatId(
            @Param("hasmiatId") Long hasmiatId);

}
