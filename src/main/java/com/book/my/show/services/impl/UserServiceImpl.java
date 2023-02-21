package com.book.my.show.services.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.book.my.show.assemblers.UserAssembler;
import com.book.my.show.entities.User;
import com.book.my.show.exceptions.UserAlreadyRegisteredException;
import com.book.my.show.exceptions.UserNotFoundException;
import com.book.my.show.models.UserRegistrationRequest;
import com.book.my.show.models.UserRegistrationResponse;
import com.book.my.show.repositories.UserRepository;
import com.book.my.show.services.UserService;

@Service
public class UserServiceImpl implements UserService {

  UserRepository userRepository;
  
  UserAssembler userAssembler;
  
  @Autowired
  public UserServiceImpl(UserRepository userRepository, UserAssembler userAssembler) {
    this.userRepository = userRepository;
    this.userAssembler = userAssembler;
  }
  
  @Override
  public UserRegistrationResponse registerUser(UserRegistrationRequest request) throws UserAlreadyRegisteredException {
    User user = new User();
    user.setUsername(request.getUsername());
    Example<User> example = Example.of(user);
    if (userRepository.exists(example)) {
        throw new UserAlreadyRegisteredException("User is already registered");
    }
    user = userAssembler.convertRequestToEntity(request);
    User savedUser = userRepository.save(user);
    return userAssembler.convertEntityToResponse(savedUser);
  }

  @Override
  public UserRegistrationResponse fetchUserDetailsById(UUID id) throws UserNotFoundException {
    User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("No user exists with given Id"));
    return userAssembler.convertEntityToResponse(user);
  }

}
