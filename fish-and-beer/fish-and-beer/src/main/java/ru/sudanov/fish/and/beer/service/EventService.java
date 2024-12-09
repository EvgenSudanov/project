package ru.sudanov.fish.and.beer.service;

import org.springframework.stereotype.Service;
import ru.sudanov.fish.and.beer.model.Event;
import ru.sudanov.fish.and.beer.model.User;

import java.util.Optional;

@Service
public interface EventService {
    Event save (Event event);

}
