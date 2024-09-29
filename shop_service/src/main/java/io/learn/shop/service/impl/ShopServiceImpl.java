package io.learn.shop.service.impl;

import io.learn.shop.entity.User;
import io.learn.shop.service.ShopService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.UUID;

@Service
public class ShopServiceImpl implements ShopService {

    final WebClient.Builder webClientBuilder;

    public ShopServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    @Override
    public User getUserByID(UUID userID, String jwtToken) {

        User user = webClientBuilder.build()
                .get()
                .uri("http://user-service/api/v1/user/get/id/{id}", userID)
                .headers(h -> h.setBearerAuth(jwtToken))
                .retrieve()
                .bodyToMono(User.class)
                .block();
        System.out.println("user: " + user);

        return user;
    }

    @Override
    public User getUserByEmail(String email, String jwtToken) {

        User user = webClientBuilder.build()
                .get()
                .uri("http://user-service/api/v1/user/get/email/{email}", email)
                .headers(h -> h.setBearerAuth(jwtToken))
                .retrieve()
                .bodyToMono(User.class)
                .block();
        System.out.println("user: " + user);

        return user;
    }

    @Override
    public List<User> getAllUsers(String jwtToken) {

        List<User> users = webClientBuilder.build()
                .get()
                .uri("http://user-service/api/v1/user/get/all")
                .headers(h -> h.setBearerAuth(jwtToken))
                .retrieve()
                .bodyToFlux(User.class)
                .collectList()
                .block();

        System.out.println("users: " + users);

        return users;
    }
}
