package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmpDowraDetDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDowraDet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpDowraDetRepo extends BaseRepository<EmpDowraDet, Long> {

    @Query(value = "SELECT NVL(MAX(e.maxId), 0) + 1 FROM EmpDowraDet e")
    Long getNextId();

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmpDowraDetDto(" +
            "dd.maxId,e.id, e.name, e.salary, e.draga, e.fia, e.naqlBadal, " +
            "dd.mokafaa,dd.badalEntidab,dd.badalTransfare,dd.ticketCost ) " +
            "FROM EmpDowraDet dd " +
            "JOIN Employee e ON dd.empId = e.id " +
            "WHERE dd.dowraId = :dowraId "+
            "ORDER BY e.name")
    List<EmpDowraDetDto> getDowraDetByDowraId(@Param("dowraId") Long dowraId);

}
