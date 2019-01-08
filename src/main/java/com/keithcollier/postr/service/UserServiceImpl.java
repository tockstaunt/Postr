package com.keithcollier.postr.service;

import com.keithcollier.postr.model.User;
import com.keithcollier.postr.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> getUsers() {
        Set<User> userSet = new HashSet<>();
        userRepository.findAll().iterator().forEachRemaining(userSet::add);

        return userSet;
    }
}
