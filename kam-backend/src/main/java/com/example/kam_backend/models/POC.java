package com.example.kam_backend.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "poc")
@Getter
@Setter
public class POC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "restaurant_id")
    private int restaurantId;

    private String name;
    private String role;
    private String email;
    private String phone;
    private boolean isPrimary;

    // Getters and Setters
}
