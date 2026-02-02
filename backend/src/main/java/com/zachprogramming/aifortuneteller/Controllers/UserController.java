package com.zachprogramming.aifortuneteller.Controllers;

import com.zachprogramming.aifortuneteller.Models.User;
import com.zachprogramming.aifortuneteller.Services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    private UserService userService;

    public  UserController(UserService userService)
    {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        String username = user.getUsername();
        String password = user.getPassword();
        User newUser = userService.createNewUser(username, password);
        return ResponseEntity.ok(newUser);
    }

}
