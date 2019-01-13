package com.keithcollier.postr.service.springdatajpaservices;


import com.keithcollier.postr.model.Post;
import com.keithcollier.postr.repository.PostRepository;
import com.keithcollier.postr.service.PostService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PostServiceSDJpa implements PostService {

    private final PostRepository postRepository;

    public PostServiceSDJpa(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post findById(Long aLong) {
        return postRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<Post> findAll(){
        Set<Post> postSet = new HashSet<>();
        postRepository.findAll().forEach(postSet::add);
        return postSet;
    }

    @Override
    public Post findByID(Long aLong) {
        return postRepository.findById(aLong).orElse(null);
    }

    @Override
    public Post save(Post object){
        return postRepository.save(object);
    }

    @Override
    public void delete(Post object) {
    postRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    postRepository.deleteById(aLong);
    }

}
