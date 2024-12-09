package ru.sudanov.fish.and.beer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sudanov.fish.and.beer.model.Role;
import ru.sudanov.fish.and.beer.model.User;
import ru.sudanov.fish.and.beer.service.UserService;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
@RequestMapping("/fishUser")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
   public void createUser (@RequestBody User user){
       userService.save(user);
   }

}
