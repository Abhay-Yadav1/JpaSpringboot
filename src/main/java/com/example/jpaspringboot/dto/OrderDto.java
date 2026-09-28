package com.example.jpaspringboot.dto;


import com.example.jpaspringboot.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderDto {
    private Long id;
    private String productName;
    private UserDto user;

    public OrderDto(Long id, String productName, User user) {
    }
}
