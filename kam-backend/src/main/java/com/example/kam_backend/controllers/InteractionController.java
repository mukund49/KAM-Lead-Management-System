package com.example.kam_backend.controllers;

import com.example.kam_backend.models.Interaction;
import com.example.kam_backend.services.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interactions")
public class InteractionController {

    @Autowired
    private InteractionService interactionService;

    @GetMapping
    public List<Interaction> getAllInteractions() {
        return interactionService.getAllInteractions();
    }

    @GetMapping("/{id}")
    public Interaction getInteractionById(@PathVariable int id) {
        return interactionService.getInteractionById(id);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public List<Interaction> getInteractionsByRestaurant(@PathVariable int restaurantId) {
        return interactionService.getInteractionsByRestaurant(restaurantId);
    }

    @PostMapping
    public Interaction createInteraction(@RequestBody Interaction interaction) {
        return interactionService.createInteraction(interaction);
    }

    @PutMapping("/{id}")
    public Interaction updateInteraction(@PathVariable int id, @RequestBody Interaction interaction) {
        return interactionService.updateInteraction(id, interaction);
    }

    @DeleteMapping("/{id}")
    public void deleteInteraction(@PathVariable int id) {
        interactionService.deleteInteraction(id);
    }
}