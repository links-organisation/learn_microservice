package io.learn.user.service;

import io.learn.user.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    Optional<User> getUserById(UUID userId);

    Optional<User> getUserByEmail(String email);

    List<User> getAll();

}
