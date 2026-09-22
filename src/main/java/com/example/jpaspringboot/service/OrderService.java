package com.example.jpaspringboot.service;


import com.example.jpaspringboot.dto.CreateOrderDto;
import com.example.jpaspringboot.dto.OrderDto;
import com.example.jpaspringboot.entities.Order;
import com.example.jpaspringboot.entities.User;
import com.example.jpaspringboot.repository.OrderRepository;
import com.example.jpaspringboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {
     private  final OrderRepository orderRepository;
     private final UserRepository userRepository;

     public OrderDto createOrder(Long userId, CreateOrderDto createOrderDto) {
           User user =userRepository.findById(userId).orElseThrow();
           Order order =new Order();
           order.setProductName(createOrderDto.getProductName());
           Order savedOrder=orderRepository.save(order);
           return new OrderDto(savedOrder.getId(),savedOrder.getProductName(),savedOrder.getUser());
     }

    public List<OrderDto> getOrdersByUserId(Long userId) {
         return
    }
}
