package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmpEndEmpSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEndEmp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpEndEmpRepo extends BaseRepository<EmpEndEmp, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmpEndEmpSearchDto(" +
            "ee.id, ee.qrarId, ee.qrarDate, " +
            "e.name, ee.endDate) " +
            "FROM EmpEndEmp ee " +
            "LEFT JOIN Employee e ON ee.empId = e.id " +
            "WHERE (:name IS NULL OR e.name LIKE %:name%)")
    List<EmpEndEmpSearchDto> searchEndEmp(
            @Param("name") String name);

}
