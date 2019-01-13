package com.keithcollier.postr.service.springdatajpaservices;


import com.keithcollier.postr.model.User;
import com.keithcollier.postr.repository.UserRepository;
import com.keithcollier.postr.service.UserService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class UserServiceSDJpa implements UserService {

    private final UserRepository userRepository;

    public UserServiceSDJpa(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    @Override
    public Set<User> getUsers() {
        Set<User> userSet = new HashSet<>();
        userRepository.findAll().forEach(userSet::add);
        return userSet;
    }

    @Override
    public Set<User> findAll() {
        Set<User> userSet = new HashSet<>();
        userRepository.findAll().forEach(userSet::add);
        return userSet;
    }

    @Override
    public User findByID(Long aLong) {
        return userRepository.findById(aLong).orElse(null);
    }

    @Override
    public User save(User object) {
        return userRepository.save(object);
    }

    @Override
    public void delete(User object) {
    userRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    userRepository.deleteById(aLong);
    }
}
