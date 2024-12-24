package com.example.kam_backend.repositories;
import com.example.kam_backend.models.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InteractionRepository extends JpaRepository<Interaction, Integer> {

    List<Interaction> findByRestaurantId(int restaurantId);

    // You can add more custom queries if needed
}