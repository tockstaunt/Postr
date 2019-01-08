package com.keithcollier.postr.service;

import com.keithcollier.postr.model.Post;
import com.keithcollier.postr.repository.PostRepository;

import java.util.HashSet;
import java.util.Set;

public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Set<Post> getPosts() {
        Set<Post> postSet = new HashSet<>();
        postRepository.findAll().iterator().forEachRemaining(postSet::add);

        return postSet;

    }
}
