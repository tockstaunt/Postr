package com.keithcollier.postr.bootstrap;

import com.keithcollier.postr.model.*;
import com.keithcollier.postr.repository.PostRepository;
import com.keithcollier.postr.repository.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserBootData implements ApplicationListener<ContextRefreshedEvent> {
    private UserRepository userRepository;
    private PostRepository postRepository;

    public UserBootData(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        userRepository.saveAll(getUser());

    }


    private List<User> getUser(){

        List<User> users = new ArrayList<>(1);


        User user = new User();
        user.setFirstName("Keith");
        user.setLastName("Collier");
        user.setUserName("tocks");
        user.setPassword("none");

        userRepository.save(user);

        return users;
    }
}
