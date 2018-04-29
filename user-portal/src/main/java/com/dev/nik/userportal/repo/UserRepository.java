package com.dev.nik.userportal.repo;


import java.util.List;

import com.dev.nik.userportal.domain.User;

public interface UserRepository {

    void delete(User user);
    List<User> findAll();
    User findOne(int id);
    User save(User user);
}
