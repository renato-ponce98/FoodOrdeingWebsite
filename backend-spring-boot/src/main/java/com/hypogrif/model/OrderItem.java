package com.hypogrif.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;
    private String paymentMethod;
    private String paymentStatus;
    private double totalAmount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
}
