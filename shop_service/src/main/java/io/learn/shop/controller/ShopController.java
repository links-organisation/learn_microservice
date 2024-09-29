package io.learn.shop.controller;

import io.learn.shop.entity.User;
import io.learn.shop.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api/v1/shop")
@RequiredArgsConstructor
public class ShopController {

    private final ShopService shopService;

    @GetMapping("get/id/{userID}")
    public ResponseEntity<User> getById(@PathVariable UUID userID, @RequestHeader("Authorization") String authorizationHeader) {
        try {
            String jwtToken = authorizationHeader.replace("Bearer ", "");
            User user = shopService.getUserByID(userID, jwtToken);
            if (user != null)
                return ResponseEntity.ok(user);
            else return ResponseEntity.notFound().build();
        } catch (Exception e) {
            System.out.println("Error Cause -> " + e.getCause());
            System.out.println("Error Message -> " + e.getMessage());
            return ResponseEntity.internalServerError().build(); // renvoie un code de statut 500
        }
    }

    @GetMapping("get/email/{email}")
    public ResponseEntity<User> getByEmail(@PathVariable String email, @RequestHeader("Authorization") String authorizationHeader) {
        try {
            String jwtToken = authorizationHeader.replace("Bearer ", "");
            User user = shopService.getUserByEmail(email, jwtToken);
            if (user != null)
                return ResponseEntity.ok(user);
            else return ResponseEntity.notFound().build();
        } catch (Exception e) {
            System.out.println("Error Cause -> " + e.getCause());
            System.out.println("Error Message -> " + e.getMessage());
            return ResponseEntity.internalServerError().build(); // renvoie un code de statut 500
        }
    }

    @GetMapping("get/all")
    public ResponseEntity<List<User>> getByEmail(@RequestHeader("Authorization") String authorizationHeader) {
        try {
            String jwtToken = authorizationHeader.replace("Bearer ", "");
            List<User> users = shopService.getAllUsers(jwtToken);
            if (!users.isEmpty())
                return ResponseEntity.ok(users);
            else return ResponseEntity.noContent().build();
        } catch (Exception e) {
            System.out.println("Error Cause -> " + e.getCause());
            System.out.println("Error Message -> " + e.getMessage());
            return ResponseEntity.internalServerError().build(); // renvoie un code de statut 500
        }
    }


}
