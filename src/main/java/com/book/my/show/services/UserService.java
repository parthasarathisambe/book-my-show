package com.book.my.show.services;

import java.util.UUID;

import com.book.my.show.exceptions.UserAlreadyRegisteredException;
import com.book.my.show.exceptions.UserNotFoundException;
import com.book.my.show.models.UserRegistrationRequest;
import com.book.my.show.models.UserRegistrationResponse;

public interface UserService {

  UserRegistrationResponse registerUser(UserRegistrationRequest request) throws UserAlreadyRegisteredException;

  UserRegistrationResponse fetchUserDetailsById(UUID id) throws UserNotFoundException;
  
}
