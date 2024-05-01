package com.example.project1.payment;

import lombok.*;

@Getter
@ToString
@Builder
public class Order {
    private double totalAmount;
    private String currency;
    private String description;
}