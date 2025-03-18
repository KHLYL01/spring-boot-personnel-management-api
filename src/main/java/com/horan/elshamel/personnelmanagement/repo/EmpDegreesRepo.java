package com.horan.elshamel.personnelmanagement.repo;

import com.horan.elshamel.personnelmanagement.base.BaseRepository;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDegrees;
import com.horan.elshamel.personnelmanagement.model.entity.EmpNations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpDegreesRepo extends BaseRepository<EmpDegrees, Long> {
}
