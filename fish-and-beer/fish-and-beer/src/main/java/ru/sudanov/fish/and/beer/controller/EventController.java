package ru.sudanov.fish.and.beer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sudanov.fish.and.beer.model.Event;
import ru.sudanov.fish.and.beer.model.User;
import ru.sudanov.fish.and.beer.service.EventService;
import ru.sudanov.fish.and.beer.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/fishEvent")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public void createEvent (@RequestBody Event event){
        eventService.save(event);
    }

}
