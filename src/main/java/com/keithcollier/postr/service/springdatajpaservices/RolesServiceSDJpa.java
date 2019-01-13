package com.keithcollier.postr.service.springdatajpaservices;

import com.keithcollier.postr.model.Roles;
import com.keithcollier.postr.repository.RolesRepository;
import com.keithcollier.postr.service.RolesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class RolesServiceSDJpa implements RolesService {

    private final RolesRepository rolesRepository;

    public RolesServiceSDJpa(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    @Override
    public Set<Roles> findAll() {
        Set<Roles> rolesSet = new HashSet<>();
        rolesRepository.findAll().forEach(rolesSet::add);
        return rolesSet;
    }

    @Override
    public Roles findByID(Long aLong) {
        return rolesRepository.findById(aLong).orElse(null);
    }

    @Override
    public Roles save(Roles object) {
        return rolesRepository.save(object);
    }

    @Override
    public void delete(Roles object) {
    rolesRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    rolesRepository.deleteById(aLong);
    }
}
