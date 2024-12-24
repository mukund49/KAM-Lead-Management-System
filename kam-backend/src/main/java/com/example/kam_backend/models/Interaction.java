package com.example.kam_backend.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "interaction")
@Getter
@Setter
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "restaurant_id")
    private int restaurantId;

    @Column(name = "kam_id")
    private int kamId;

    private String type;
    private String details;

    private LocalDateTime interactionDate;

}
