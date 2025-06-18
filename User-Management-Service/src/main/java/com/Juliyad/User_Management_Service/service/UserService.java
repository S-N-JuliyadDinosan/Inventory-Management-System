package com.Juliyad.User_Management_Service.service;

import com.Juliyad.User_Management_Service.api.dto.CreateUserDto;
import com.Juliyad.User_Management_Service.api.dto.GetUserDto;

public interface UserService {

    GetUserDto createUser(CreateUserDto createUserDto);

    GetUserDto getUserById(Long id);
}
