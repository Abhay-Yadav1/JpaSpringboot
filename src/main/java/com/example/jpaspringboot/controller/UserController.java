package com.example.jpaspringboot.controller;


import com.example.jpaspringboot.dto.CreateUserDto;
import com.example.jpaspringboot.dto.UserDto;
import com.example.jpaspringboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody CreateUserDto createUserDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(createUserDto));
    }
    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUsers());
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @PatchMapping("/{id}")
    public ResponseEntity<UserDto> patchUsers(@PathVariable Long id, @RequestBody CreateUserDto patchUserDto){
        return ResponseEntity.status(HttpStatus.OK).body(userService.patchUser(id,patchUserDto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<UserDto> UpdateUser(@PathVariable Long id,@RequestBody CreateUserDto updateUserDto){
        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(id,updateUserDto));
    }

}
