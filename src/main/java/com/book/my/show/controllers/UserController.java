package com.book.my.show.controllers;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.my.show.exceptions.UserAlreadyRegisteredException;
import com.book.my.show.exceptions.UserNotFoundException;
import com.book.my.show.models.UserRegistrationRequest;
import com.book.my.show.models.UserRegistrationResponse;
import com.book.my.show.services.UserService;

@RestController
@RequestMapping("/bookmyshow/user/")
public class UserController {

  UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("register")
  public ResponseEntity<UserRegistrationResponse> registerUser(
      @RequestBody @Valid UserRegistrationRequest userRegistrationRequest) throws UserAlreadyRegisteredException {
    UserRegistrationResponse response = userService.registerUser(userRegistrationRequest);
    response.setStatus("User registered Successfully.");
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @GetMapping("{id}")
  public ResponseEntity<UserRegistrationResponse> getUserById(@PathVariable UUID id) throws UserNotFoundException {
    UserRegistrationResponse response = userService.fetchUserDetailsById(id);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

}
