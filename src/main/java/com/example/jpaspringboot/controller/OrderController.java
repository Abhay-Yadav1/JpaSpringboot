package com.example.jpaspringboot.controller;


import com.example.jpaspringboot.dto.CreateOrderDto;
import com.example.jpaspringboot.dto.OrderDto;
import com.example.jpaspringboot.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users/{userId}/orders")
public class OrderController {
     private final OrderService orderService;
     @PostMapping
     public ResponseEntity<OrderDto> createOrder(@PathVariable Long userId, @RequestBody CreateOrderDto createOrderDto){
         return ResponseEntity.status(HttpStatus.CREATED).body(orderService.createOrder(userId,createOrderDto));
     }
}
