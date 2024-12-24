package com.example.kam_backend.repositories;
import com.example.kam_backend.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

    List<Restaurant> findByKamId(int kamId);

    // You can add more custom queries if needed
}