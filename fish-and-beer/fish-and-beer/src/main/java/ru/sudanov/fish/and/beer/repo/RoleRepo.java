package ru.sudanov.fish.and.beer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sudanov.fish.and.beer.model.Role;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role ,Long> {
    Optional <Role> findByName (String name);
}
