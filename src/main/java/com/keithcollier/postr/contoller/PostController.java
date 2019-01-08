package com.keithcollier.postr.contoller;

import com.keithcollier.postr.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    private final UserService userService;

    public PostController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({"","/","index"})
    public String index(Model model){

        model.addAttribute("user", userService.getUsers());

        return "index";
    }
}
