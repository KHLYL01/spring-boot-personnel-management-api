package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.entity.EmpJobs;
import com.horan.elshamel.personnelmanagement.model.entity.EmpParts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpPartsRepo extends BaseRepository<EmpParts, Long> {

    @Query("SELECT p FROM EmpParts p" +
            " WHERE (:id IS NULL OR p.id = :id)" +
            " AND (:name IS NULL OR p.name LIKE %:name%)")
    List<EmpParts> findParts(
            @Param("id") Long id,
            @Param("name") String name
    );

}
