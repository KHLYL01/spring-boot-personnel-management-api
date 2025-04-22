package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.EmpTarqeaSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTarqea;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpTarqeaRepo extends BaseRepository<EmpTarqea, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.EmpTarqeaSearchDto(" +
            "t.id, t.qrarId, t.qrarDate, " +
            "e.name, t.oldFia, t.newFia) " +
            "FROM EmpTarqea t " +
            "JOIN Employee e ON t.empId = e.id " +
            "WHERE (:qrarId IS NULL OR t.qrarId LIKE %:qrarId%) " +
            "AND (:name IS NULL OR e.name LIKE %:name%)")
    List<EmpTarqeaSearchDto> searchTarqea(
            @Param("qrarId") String qrarId,
            @Param("name") String name);

}
