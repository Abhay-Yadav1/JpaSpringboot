package com.example.jpaspringboot.service;

import com.example.jpaspringboot.dto.CreateUserDto;
import com.example.jpaspringboot.dto.UserDto;
import com.example.jpaspringboot.entities.User;
import com.example.jpaspringboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public UserDto saveUser(CreateUserDto createUserDto) {
        User user  = new User();
        user.setEmail(createUserDto.getEmail());
        user.setName(createUserDto.getName());
        User savedUser=userRepository.save(user);
        return new UserDto(savedUser.getId(),savedUser.getName(),savedUser.getEmail());
    }

    public List<UserDto> getUsers() {
    }


    public Void getUserById(Long id) {
    }

    public void deleteUser(Long id) {
    }
}
