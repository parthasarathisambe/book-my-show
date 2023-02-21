package com.book.my.show.assemblers;

import org.springframework.stereotype.Component;

import com.book.my.show.entities.User;
import com.book.my.show.models.UserRegistrationRequest;
import com.book.my.show.models.UserRegistrationResponse;

@Component
public class UserAssembler {

  public User convertRequestToEntity(UserRegistrationRequest request) {
    User user = new User();
    user.setName(request.getName());
    user.setPassword(request.getPassword());
    user.setPhone(request.getPhone());
    user.setUsername(request.getUsername());
    return user;
  }

  public UserRegistrationResponse convertEntityToResponse(User user) {
    UserRegistrationResponse response = new UserRegistrationResponse();
    response.setId(user.getId());
    response.setName(user.getName());
    response.setUsername(user.getUsername());
    return response;
  }

}
