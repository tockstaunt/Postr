package com.keithcollier.postr.repository;

import com.keithcollier.postr.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
