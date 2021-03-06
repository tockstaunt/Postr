package com.keithcollier.postr.service.map;

import com.keithcollier.postr.model.Roles;
import com.keithcollier.postr.service.RolesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RolesServiceMap extends AbstractMapService<Roles, Long> implements RolesService {

    @Override
    public Set<Roles> findAll() {
        return super.findAll();
    }

    @Override
    public Roles findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Roles findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Roles save(Roles object) {
        return super.save(object);
    }

    @Override
    public void delete(Roles object) {
        this.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);

    }

}
