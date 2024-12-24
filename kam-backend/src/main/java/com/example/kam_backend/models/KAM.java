package com.example.kam_backend.models;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "kam")
@Getter
@Setter
public class KAM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String phone;

    @CreationTimestamp
    private Timestamp timestamp;

    private LocalDate joinedDate;

}

