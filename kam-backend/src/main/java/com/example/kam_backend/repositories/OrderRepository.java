package com.example.kam_backend.repositories;

import com.example.kam_backend.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByRestaurantId(int restaurantId);

    // You can add more custom queries if needed
}