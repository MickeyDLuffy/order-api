package com.github.mickeydeeluffy.orderapi.repository;

import com.github.mickeydeeluffy.orderapi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Override
    List<Order> findAll();
}
