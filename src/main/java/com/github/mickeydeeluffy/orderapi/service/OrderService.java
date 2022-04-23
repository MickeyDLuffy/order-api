package com.github.mickeydeeluffy.orderapi.service;

import com.github.mickeydeeluffy.orderapi.entity.Order;
import com.github.mickeydeeluffy.orderapi.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public Order book(Order order) {
        return this.orderRepository.save(order);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}
