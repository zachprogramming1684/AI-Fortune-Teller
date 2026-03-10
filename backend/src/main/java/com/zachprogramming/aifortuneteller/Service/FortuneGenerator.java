package com.zachprogramming.aifortuneteller.Service;

import com.google.genai.Client;
import com.zachprogramming.aifortuneteller.Model.Fortune;
import com.zachprogramming.aifortuneteller.Model.User;
import com.zachprogramming.aifortuneteller.Repository.FortuneRepository;
import com.zachprogramming.aifortuneteller.Repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FortuneGenerator
{
    // needs to take in emotions
    private UserRepository userRepository;
    private FortuneRepository fortuneRepository;
    private AiService aiService;

    public FortuneGenerator(UserRepository userRepository, FortuneRepository fortuneRepository,  AiService aiService)
    {
        this.userRepository = userRepository;
        this.fortuneRepository = fortuneRepository;
        this.aiService = aiService;
    }


    public Fortune generateFortune(List<String> attributes)
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currUsername = authentication.getName();
        User currentUser = userRepository.findByUsername(currUsername)
                .orElseThrow(() -> new RuntimeException("User not found in database"));
        Fortune newFortune = new Fortune();
        newFortune.setUser(currentUser);

        // logic with the ai and attributes
        //TODO: once ai service works, finish fortune generation logic here and in the controller THEN figure out new users and logging in

        return fortuneRepository.save(newFortune);
    }


}
