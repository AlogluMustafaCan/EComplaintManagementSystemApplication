package com.lglsys.ecomplaint.controllers;

import com.lglsys.ecomplaint.entities.UserEntity;
import com.lglsys.ecomplaint.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/createUser")
    public String registerNewUser(@RequestBody UserEntity User){
        userRepository.save(User);
        return "User is registered";
    }

    @GetMapping("/getUser")
    public ResponseEntity<List<UserEntity>> getAllUsers(){
        return ResponseEntity.ok().body(userRepository.findAll());
    }
}
