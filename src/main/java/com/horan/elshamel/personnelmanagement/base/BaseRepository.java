package com.horan.elshamel.personnelmanagement.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T,ID extends Number> extends JpaRepository<T,ID> {
}
