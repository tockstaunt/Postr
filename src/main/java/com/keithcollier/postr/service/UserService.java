package com.keithcollier.postr.service;

import com.keithcollier.postr.model.User;

import java.util.Set;

public interface UserService extends CrudService<User, Long>{

    User findByFirstName(String firstName);
    Set<User> getUsers();
}
