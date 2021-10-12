package com.ecommerce.shop.data.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    private Double price;
    private String currency;
    private String details;
    @ElementCollection
    private List<String> imageUrl;
    @OneToMany
    private List<Feedback> feedback;
}
