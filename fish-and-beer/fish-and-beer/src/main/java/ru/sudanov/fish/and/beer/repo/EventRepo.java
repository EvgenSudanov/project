package ru.sudanov.fish.and.beer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sudanov.fish.and.beer.model.Event;
import ru.sudanov.fish.and.beer.model.User;

import java.util.Optional;

@Repository
public interface EventRepo extends JpaRepository<Event, Long> {
//    Optional<Event> findByUser (User user);
}
