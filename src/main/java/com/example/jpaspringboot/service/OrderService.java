package com.example.jpaspringboot.service;


import com.example.jpaspringboot.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {
     private  final OrderRepository orderRepository;

}
