package com.keithcollier.postr.service.springdatajpaservices;


import com.keithcollier.postr.model.User;
import com.keithcollier.postr.repository.UserRepository;
import com.keithcollier.postr.service.UserService;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
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


    public User findByLastName(String lastName) {
        return userRepository.findByLastName(lastName);
    }


    public Set<User> findAll() {

        Set<User> userSet = new HashSet<>();
        userRepository.findAll().forEach(userSet::add);
        return userSet;
    }


    public User findByID(Long aLong) {

        return userRepository.findById(aLong).orElse(null);

    }


    public User save(User object) {
        return userRepository.save(object);
    }


    public void delete(User object) {

        userRepository.delete(object);
    }


    public void deleteById(Long aLong) {

        userRepository.deleteById(aLong);
    }
}
