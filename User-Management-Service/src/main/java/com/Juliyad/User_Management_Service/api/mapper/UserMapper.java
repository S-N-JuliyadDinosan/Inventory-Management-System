package com.Juliyad.User_Management_Service.api.mapper;

import com.Juliyad.User_Management_Service.api.dto.CreateUserDto;
import com.Juliyad.User_Management_Service.api.dto.GetUserDto;
import com.Juliyad.User_Management_Service.entity.User;

public class UserMapper {

    public static GetUserDto mapToGetUserDto(User user){
        return new GetUserDto(
                user.getUserId(),
                user.getName(),
                user.getRole()
        );
    }

    public static User mapToUser(CreateUserDto createUserDto){
        return new User(
                createUserDto.getName(),
                createUserDto.getRole(),
                createUserDto.getNicNumber()
        );
    }
}
