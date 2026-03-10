package com.zachprogramming.aifortuneteller.Repository;

import com.zachprogramming.aifortuneteller.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>
{
    Optional<User> findByUsername(String username); // gives a way to search by username when making for fetching fortunes for a user
}
