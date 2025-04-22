package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.entity.EmpNations;
import com.horan.elshamel.personnelmanagement.model.entity.EmpNations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpNationsRepo extends BaseRepository<EmpNations, Long> {

    @Query("SELECT j FROM EmpNations j" +
            " WHERE (:id IS NULL OR j.id = :id)" +
            " AND (:name IS NULL OR j.name LIKE %:name%)")
    List<EmpNations> findNations(
            @Param("id") Long id,
            @Param("name") String name
    );

}
