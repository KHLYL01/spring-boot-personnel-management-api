package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmpHasmiatDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.EmpMokhalfatDetDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmDet;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMokhalfatDet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMokhalfatDetRepo extends BaseRepository<EmpMokhalfatDet, Long> {

    @Query(value = "SELECT NVL(MAX(e.maxId), 0) + 1 FROM EmpMokhalfatDet e")
    Long getNextId();

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmpMokhalfatDetDto(" +
            "md.maxId,e.id, e.name, e.salary, e.naqlBadal,e.fia, " +
            "e.draga,md.gza) " +
            "FROM EmpMokhalfatDet md " +
            "JOIN Employee e ON md.empId = e.id " +
            "WHERE md.mokhalfaId = :mokhalfaId "+
            "ORDER BY e.name")
    List<EmpMokhalfatDetDto> getMokhalfatDetByMokhalfatId(
            @Param("mokhalfaId") Long mokhalfaId);

}
