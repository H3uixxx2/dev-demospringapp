package com.dev.demo.mapper;

import com.dev.demo.dto.request.UserCreationRequest;
import com.dev.demo.dto.request.UserUpdateRequest;
import com.dev.demo.dto.response.UserResponse;
import com.dev.demo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
