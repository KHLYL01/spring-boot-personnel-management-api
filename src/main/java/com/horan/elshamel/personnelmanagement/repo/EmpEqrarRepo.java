package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpEqrarSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEqrar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpEqrarRepo extends BaseRepository<EmpEqrar, Long> {

    @Query("SELECT NEW com.horan.elshamel.personnelmanagement.model.dto.query.EmpEqrarSearchDto(" +
            "e.id,e.decisionName,e.decisionDate,e.decisionPlace, " +
            "e.letterNumber,e.letterName,e.letterDate) " +
            "FROM EmpEqrar e " +
            "WHERE (:name IS NULL OR e.decisionName LIKE %:name%) ")
    List<EmpEqrarSearchDto> searchEqrar(
            @Param("name") String name
    );

}
