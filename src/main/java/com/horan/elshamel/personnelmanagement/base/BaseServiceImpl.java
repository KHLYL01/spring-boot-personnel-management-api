package com.horan.elshamel.personnelmanagement.base;

import jakarta.persistence.MappedSuperclass;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@MappedSuperclass
public abstract class BaseServiceImpl<T, ID extends Number> implements BaseService<ID,T> {

    private BaseRepository<T, ID> repo;

    @Autowired
    void RepoSetter(ObjectProvider<BaseRepository<T, ID>> repo) {
        this.repo = repo.getIfAvailable();
    }

    @Override
    public List<T> findAll() {
        return repo.findAll();
    }

    @Override
    public T findById(ID id) {
        return repo.findById(id).orElseThrow(() -> new IllegalArgumentException("ID in path does not match ID in request body"));
    }

    @Override
    public T save(T entity) {
        return repo.save(entity);
    }


    @Override
    public void deleteById(ID id) {
        T entity = findById(id);
        repo.delete(entity);
    }
}
