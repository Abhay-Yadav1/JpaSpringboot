package com.example.jpaspringboot.service;


import com.example.jpaspringboot.dto.CreateOrderDto;
import com.example.jpaspringboot.dto.OrderDto;
import com.example.jpaspringboot.entities.Order;
import com.example.jpaspringboot.entities.User;
import com.example.jpaspringboot.repository.OrderRepository;
import com.example.jpaspringboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        List<Order> orders=orderRepository.findByUserId(userId);
        List<OrderDto> orderDtos=new ArrayList<>();
        orders.forEach(order -> {
            OrderDto orderDto=new OrderDto(order.getId(),order.getProductName(),order.getUser());
        orderDtos.add(orderDto);});
        return orderDtos;

    }
}
