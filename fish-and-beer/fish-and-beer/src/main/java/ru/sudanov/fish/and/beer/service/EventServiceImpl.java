package ru.sudanov.fish.and.beer.service;

import org.springframework.stereotype.Service;
import ru.sudanov.fish.and.beer.model.Event;
import ru.sudanov.fish.and.beer.model.User;
import ru.sudanov.fish.and.beer.repo.EventRepo;

import java.util.Optional;

@Service
public class EventServiceImpl implements  EventService {
private final EventRepo eventRepo;

    public EventServiceImpl(EventRepo eventRepo) {
        this.eventRepo = eventRepo;
    }

    @Override
    public Event save(Event event) {
        Event event1 = eventRepo.save(event);
        return event1;
    }


}
