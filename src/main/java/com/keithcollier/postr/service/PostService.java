package com.keithcollier.postr.service;

import com.keithcollier.postr.model.Post;

import java.util.Set;

public interface PostService {
    Set<Post> getPosts();
}
