package io.learn.shop.service;

import io.learn.shop.entity.User;

import java.util.List;
import java.util.UUID;

public interface ShopService {
    User getUserByID(UUID userID, String jwtToken);

    User getUserByEmail(String email, String jwtToken);

    List<User> getAllUsers(String jwtToken);
}
