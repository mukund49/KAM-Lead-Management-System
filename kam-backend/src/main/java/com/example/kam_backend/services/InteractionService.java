package com.example.kam_backend.services;


import com.example.kam_backend.models.Interaction;
import com.example.kam_backend.repositories.InteractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionService {

    @Autowired
    private InteractionRepository interactionRepository;

    public List<Interaction> getAllInteractions() {
        return interactionRepository.findAll();
    }

    public Interaction getInteractionById(int id) {
        return interactionRepository.findById(id).orElse(null);
    }

    public List<Interaction> getInteractionsByRestaurant(int restaurantId) {
        return interactionRepository.findByRestaurantId(restaurantId);
    }

    public Interaction createInteraction(Interaction interaction) {
        return interactionRepository.save(interaction);
    }

    public Interaction updateInteraction(int id, Interaction interaction) {
        if (interactionRepository.existsById(id)) {
            interaction.setId(id);
            return interactionRepository.save(interaction);
        }
        return null;
    }

    public void deleteInteraction(int id) {
        if (interactionRepository.existsById(id)) {
            interactionRepository.deleteById(id);
        }
    }
}
