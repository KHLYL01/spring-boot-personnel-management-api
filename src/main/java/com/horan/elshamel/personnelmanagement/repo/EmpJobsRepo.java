package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.entity.EmpJobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpJobsRepo extends BaseRepository<EmpJobs, Long> {

    @Query("SELECT j FROM EmpJobs j" +
            " WHERE (:id IS NULL OR j.id = :id)" +
            " AND (:name IS NULL OR j.name LIKE %:name%)")
    List<EmpJobs> findJobs(
            @Param("id") Long id,
            @Param("name") String name
    );

}
