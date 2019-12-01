package com.example.demo.controllers;
import com.example.demo.entities.User;
import com.example.demo.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/bookStore/user")
@CrossOrigin

@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("")
    public ResponseEntity<User> addRate(@RequestBody User user) {

        User savedUser= userService.saveUser(user);

        return savedUser != null ? new ResponseEntity<>(savedUser, HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getRatesById (@PathVariable int id){
        User user=userService.getUserById(id);

        return user != null ? new ResponseEntity<>(user, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
