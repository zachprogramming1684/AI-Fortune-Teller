package com.zachprogramming.aifortuneteller.Service;

import com.zachprogramming.aifortuneteller.Model.Fortune;
import com.zachprogramming.aifortuneteller.Model.User;
import com.zachprogramming.aifortuneteller.Repository.FortuneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FortuneService
{
    private FortuneRepository fortuneRepository;

    public FortuneService(FortuneRepository fortuneRepository)
    {
        this.fortuneRepository = fortuneRepository;
    }

    public List<Fortune> getAllFortunes() {return fortuneRepository.findAll();}

    /*
        Need to return all fortunes for a given user
        Each fortune in the database will have a foreign key,
        this key is the user it is associated with
     */
    public List<Fortune> fetchFortunesForUser(User user)
    {
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
