package com.zachprogramming.aifortuneteller.Service;

import com.zachprogramming.aifortuneteller.Repository.FortuneRepository;
import org.springframework.stereotype.Service;

@Service
public class FortuneService
{
    private FortuneRepository fortuneRepository;

    public FortuneService(FortuneRepository fortuneRepository)
    {
        this.fortuneRepository = fortuneRepository;
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
