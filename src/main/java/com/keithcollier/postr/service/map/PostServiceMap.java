package com.keithcollier.postr.service.map;

import com.keithcollier.postr.model.Post;
import com.keithcollier.postr.service.PostService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PostServiceMap extends AbstractMapService<Post, Long> implements PostService {

    @Override
    public Set<Post> findAll() {
        return super.findAll();
    }

    @Override
    public Post findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Post findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Post save(Post object) {
        return super.save(object);
    }

    @Override
    public void delete(Post object) {
        this.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);

    }

}
