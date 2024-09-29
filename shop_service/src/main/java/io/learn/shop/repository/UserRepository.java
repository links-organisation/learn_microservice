package io.learn.shop.repository;

import io.learn.shop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    @Query("select u from User u where u.email ilike %?1%")
    Optional<User> findByEmail(String email);

    @Query("select u from User u where u.firstName ilike %?1%")
    List<User> findByFirstName(String firstName);

    @Query("select u from User u where u.lastName ilike %?1%")
    List<User> findByLastName(String lastName);
}
