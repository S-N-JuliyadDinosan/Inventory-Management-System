package com.Juliyad.User_Management_Service.service.impl;

import com.Juliyad.User_Management_Service.repository.UserRepository;
import com.Juliyad.User_Management_Service.api.dto.CreateUserDto;
import com.Juliyad.User_Management_Service.api.dto.GetUserDto;
import com.Juliyad.User_Management_Service.api.mapper.UserMapper;
import com.Juliyad.User_Management_Service.entity.User;
import com.Juliyad.User_Management_Service.exception.UserAlreadyExistsException;
import com.Juliyad.User_Management_Service.exception.UserNotFoundException;
import com.Juliyad.User_Management_Service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public GetUserDto createUser(CreateUserDto createUserDto) {
        Optional<User> user = userRepository.findByNicNumber(createUserDto.getNicNumber());
        if(user.isEmpty()){
            createUserDto.setRole(createUserDto.getRole().toUpperCase());
            User newUser = UserMapper.mapToUser(createUserDto);
            User savedUser = userRepository.save(newUser);
            return UserMapper.mapToGetUserDto(savedUser);
        }
        else{
            throw new UserAlreadyExistsException("Nic number with " + createUserDto.getNicNumber() + " already exists");
        }
    }

    @Override
    public GetUserDto getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("The user with the id " + id + " is not found"));
        return UserMapper.mapToGetUserDto(user);
    }
}
