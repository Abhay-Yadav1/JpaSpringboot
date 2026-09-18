package com.example.jpaspringboot.repository;

import com.example.jpaspringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
