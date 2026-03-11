package com.zachprogramming.aifortuneteller.Service;

import com.zachprogramming.aifortuneteller.Model.Fortune;
import com.zachprogramming.aifortuneteller.Model.User;
import com.zachprogramming.aifortuneteller.Repository.FortuneRepository;
import com.zachprogramming.aifortuneteller.Repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FortuneService
{
    private FortuneRepository fortuneRepository;
    private UserRepository userRepository;
    public FortuneService(FortuneRepository fortuneRepository,  UserRepository userRepository)
    {
        this.fortuneRepository = fortuneRepository;
        this.userRepository = userRepository;
    }

    public List<Fortune> getAllFortunes() {return fortuneRepository.findAll();}

    /*
        Need to return all fortunes for a given user
        Each fortune in the database will have a foreign key,
        this key is the user it is associated with
     */
    public List<Fortune> fetchFortunesForUser(User user)
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currUsername = authentication.getName();
        User currentUser = userRepository.findByUsername(currUsername)
                .orElseThrow(() -> new RuntimeException("User not found in database"));
        //TODO: now that we have the current user, find a way to ping the db and fetch all fortunes for the current user
        return null;
    }


    /*
        Need methods for:
        - creating a new user (DONE)
        - fetching current user (or by username) (DONE)
        - saving a fortune to a user account
        - fetching all fortunes
        - fetching all fortunes for a user
        - fetching all users (DONE)
     */

}
