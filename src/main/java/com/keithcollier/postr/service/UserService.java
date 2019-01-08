package com.keithcollier.postr.service;

import com.keithcollier.postr.model.User;

import java.util.Set;

public interface UserService {
    Set<User> getUsers();
}
