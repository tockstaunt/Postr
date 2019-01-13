package com.keithcollier.postr.service.map;

import com.keithcollier.postr.model.User;
import com.keithcollier.postr.service.UserService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceMap extends AbstractMapService<User, Long> implements UserService {

    @Override
    public Set<User> findAll() {
        return super.findAll();
    }

    @Override
    public User findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public User findById(Long id) {
        return super.findById(id);
    }

    @Override
    public User save(User object) {
            return super.save(object);
    }

    @Override
    public void delete(User object) {
        this.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);

    }

    @Override
    public User findByFirstName(String firstName) {
        return null;
    }

    @Override
    public Set<User> getUsers() {
        return super.findAll();
    }


}
