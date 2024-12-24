package com.example.kam_backend.repositories;

import com.example.kam_backend.models.KAM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KAMRepository extends JpaRepository<KAM, Integer> {
    // You can add custom queries if needed
}