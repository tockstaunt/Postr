package com.keithcollier.postr.repository;

import com.keithcollier.postr.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, String> {

}
