package com.example.jpaspringboot.controller;


import com.example.jpaspringboot.dto.OrderDto;
import com.example.jpaspringboot.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/new")
@AllArgsConstructor
public class newcontroller {
     private final OrderService orderService;

     @GetMapping
    public List<OrderDto> getByUserId(){

     }
}
