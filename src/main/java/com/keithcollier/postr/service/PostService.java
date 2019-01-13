package com.keithcollier.postr.service;

import com.keithcollier.postr.model.Post;

public interface PostService extends CrudService<Post, Long> {

    Post findById(Long id);
}
