package com.zachprogramming.aifortuneteller.Services;

import com.zachprogramming.aifortuneteller.Models.User;
import com.zachprogramming.aifortuneteller.Repository.FortuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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
