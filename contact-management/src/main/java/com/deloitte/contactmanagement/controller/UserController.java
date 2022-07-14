package com.deloitte.contactmanagement.controller;


import com.deloitte.contactmanagement.entity.UserDataDTO;
import com.deloitte.contactmanagement.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> singUp(@RequestBody UserDataDTO user){
        return new ResponseEntity<>(userService.signUp(user), HttpStatus.CREATED);
    }
}
