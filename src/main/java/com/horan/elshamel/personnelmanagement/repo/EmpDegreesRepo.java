package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegrees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpDegreesRepo extends BaseRepository<EmpDegrees, Long> {

    @Query("SELECT j FROM EmpDegrees j" +
            " WHERE (:martaba IS NULL OR j.martaba = :martaba)" +
            " AND (:draga IS NULL OR j.draga = :draga)")
    List<EmpDegrees> findDegrees(
            @Param("martaba") Double martaba,
            @Param("draga") Double draga
    );

}
