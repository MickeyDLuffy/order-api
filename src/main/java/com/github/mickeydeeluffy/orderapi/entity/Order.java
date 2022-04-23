package com.github.mickeydeeluffy.orderapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private int quantity;
    private double price;
}
