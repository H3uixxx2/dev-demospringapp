package com.dev.demo.service;

import com.dev.demo.dto.request.UserCreationRequest;
import com.dev.demo.dto.request.UserUpdateRequest;
import com.dev.demo.dto.response.UserResponse;
import com.dev.demo.entity.User;

import java.util.List;

public interface UserService {

    User createUser(UserCreationRequest request);

    List<User> findAllUsers();

    UserResponse findUserById(String id);

    UserResponse updateUser(String userId, UserUpdateRequest request);

    void deleteUser(String userId);
}
