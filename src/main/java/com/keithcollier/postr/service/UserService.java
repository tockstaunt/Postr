package com.keithcollier.postr.service;

import com.keithcollier.postr.model.User;

import java.util.Set;

public interface UserService {

    User findByFirstName(String firstName);
    Set<User> getUsers();
}
