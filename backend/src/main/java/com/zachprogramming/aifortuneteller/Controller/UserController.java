package com.zachprogramming.aifortuneteller.Controller;

import com.zachprogramming.aifortuneteller.Model.User;
import com.zachprogramming.aifortuneteller.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
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
