package com.example.kam_backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "restaurant")
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String address;
    private String status;

    @Column(name = "kam_id")
    private int kamId;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private int callFrequency;
    private LocalDate lastCallDate;

}
