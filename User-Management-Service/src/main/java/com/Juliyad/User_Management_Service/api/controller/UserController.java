package com.Juliyad.User_Management_Service.api.controller;

import com.Juliyad.User_Management_Service.api.dto.CreateUserDto;
import com.Juliyad.User_Management_Service.api.dto.GetUserDto;
import com.Juliyad.User_Management_Service.service.UserService;
import com.Juliyad.User_Management_Service.util.EndpointBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(EndpointBundle.BASE_URL)
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<GetUserDto> createUser(@RequestBody CreateUserDto createUserDto){
        GetUserDto user = userService.createUser(createUserDto);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping(EndpointBundle.ID)
    public ResponseEntity<GetUserDto> getUserById(@PathVariable Long id){
        GetUserDto user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.FOUND);
    }
}
