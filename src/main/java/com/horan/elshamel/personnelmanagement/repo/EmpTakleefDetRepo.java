package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.det.EmpTakleefDetDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTakleefDet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpTakleefDetRepo extends BaseRepository<EmpTakleefDet, Long> {

    @Query(value = "SELECT NVL(MAX(e.maxId), 0) + 1 FROM EmpTakleefDet e")
    Long getNextId();

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.det.EmpTakleefDetDto(" +
            "td.maxId,e.id, e.name, e.salary, e.naqlBadal,td.period, " +
            "td.datBegin,td.datEnd,td.empWork) " +
            "FROM EmpTakleefDet td " +
            "JOIN Employee e ON td.empId = e.id " +
            "WHERE td.takleefId = :takleefId "+
            "ORDER BY e.name")
    List<EmpTakleefDetDto> getTakleefDetByTakleefId(
            @Param("takleefId") Long takleefId);

}
