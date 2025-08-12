package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.model.entity.User;
import com.horan.elshamel.personnelmanagement.model.entity.UserPermission;
import com.horan.elshamel.personnelmanagement.repo.UserRepo;
import com.horan.elshamel.personnelmanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo repo;

    @Override
    public List<User> findAll() {
        return repo.findAll();
    }

    @Override
    public User findById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User save(User entity) {

        List<UserPermission> userPermissions = entity.getUserPermissions();
        if (userPermissions != null) {
            userPermissions.forEach(permission -> {
                    permission.setUser(entity);
            });
        }

        return repo.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
