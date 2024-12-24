package com.example.kam_backend.repositories;

import com.example.kam_backend.models.POC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface POCRepository extends JpaRepository<POC, Integer> {

    List<POC> findByRestaurantId(int restaurantId);

    // You can add more custom queries if needed
}