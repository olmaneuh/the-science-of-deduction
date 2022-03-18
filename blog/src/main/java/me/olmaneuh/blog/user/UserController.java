package me.olmaneuh.blog.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/signup")
    public String displaySignupForm() {
        return "signup";
    }

    @PostMapping("/create-user")
    public String createUser(@Valid User user, BindingResult result, Model model) {
        System.out.println("Hello, World!");
        return "index";
    }

}
