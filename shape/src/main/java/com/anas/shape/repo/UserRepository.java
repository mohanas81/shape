package com.anas.shape.repo;

import com.anas.shape.model.User;

public interface UserRepository {
    User findByUsername(String username);
    User findByEmaul(String email);
    User findById(Long id);

    User save(User user);
    void deleteByUsername(String username);

}
