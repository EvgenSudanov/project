package ru.sudanov.fish.and.beer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sudanov.fish.and.beer.model.User;
import ru.sudanov.fish.and.beer.repo.RoleRepo;
import ru.sudanov.fish.and.beer.repo.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    public UserServiceImpl(UserRepo userRepo, RoleRepo roleRepo) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
    }
//    private  final PasswordEncoder passwordEncoder;
//    @Override
//    public User findByLogin(String login) {
//        Optional<User> user = userRepo.findByLogin(login);
//        User user1 = user.get();
//        return user1;
//    }

//    @Override
//    public User findById(Long id) {
//       Optional<User>user = userRepo.findById(id);
//       User user1 = user.get();
//        return user1;
//    }

    @Override
    public User save(User user) {
        User newUser = userRepo.save(user);
        return newUser;
    }
//
//    @Override
//    public void delete(Long id) {
//userRepo.delete(userRepo.findById(id).get());
//    }
}
