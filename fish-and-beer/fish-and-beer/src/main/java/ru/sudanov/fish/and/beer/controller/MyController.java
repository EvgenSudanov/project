package ru.sudanov.fish.and.beer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.sudanov.fish.and.beer.service.EventService;
import ru.sudanov.fish.and.beer.service.UserService;

@Controller
@RequiredArgsConstructor
public class MyController {
    private final UserService userService;
    private final EventService eventService;

    public MyController(UserService userService, EventService eventService) {
        this.userService = userService;
        this.eventService = eventService;
    }

    @GetMapping
    public String getMainPage(){
        return "fish";
    }

}
