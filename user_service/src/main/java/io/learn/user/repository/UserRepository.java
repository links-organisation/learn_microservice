package io.learn.user.repository;

import io.learn.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.email ilike %?1%")
    Optional<User> findByEmail(String email);

    @Query("select u from User u where u.id = ?1")
    Optional<User> findById(UUID userId);
}
