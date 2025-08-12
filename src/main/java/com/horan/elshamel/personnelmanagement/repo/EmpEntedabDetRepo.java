package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.det.EmpEntedabDetDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEntedabDet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpEntedabDetRepo extends BaseRepository<EmpEntedabDet, Long> {

    @Query(value = "SELECT NVL(MAX(e.maxId), 0) + 1 FROM EmpEntedabDet e")
    Long getNextId();

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.det.EmpEntedabDetDto(" +
            "ed.maxId, ed.entedabId, ed.empId, e.name, e.salary, e.fia, " +
            "e.draga, e.naqlBadal,e.inEntedabBadal, " +
            "ed.prev, ed.externalEntedab ) " +
            "FROM EmpEntedabDet ed " +
            "INNER JOIN Employee e ON ed.empId = e.id " +
            "WHERE ed.entedabId = :entedabId "+
            "ORDER BY e.name")
    List<EmpEntedabDetDto> getEntedabDetByEntedabId(
            @Param("entedabId") Long entedabId);

}
