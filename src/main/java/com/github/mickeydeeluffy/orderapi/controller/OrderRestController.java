package com.github.mickeydeeluffy.orderapi.controller;

import com.github.mickeydeeluffy.orderapi.entity.Order;
import com.github.mickeydeeluffy.orderapi.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderRestController {
    private final OrderService orderService;
    @PostMapping
    public ResponseEntity<Order> book(@RequestBody Order order, UriComponentsBuilder b) {
        URI uri = b.path("/api/order/")
                .build()
                .toUri();
        return ResponseEntity.
                created(uri)
                .body(orderService.book(order));

    }

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(orderService.findAll());
    }
}
