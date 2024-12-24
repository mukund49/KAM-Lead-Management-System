package com.example.kam_backend.controllers;


import com.example.kam_backend.models.POC;
import com.example.kam_backend.services.POCService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pocs")
public class POCController {

    @Autowired
    private POCService pocService;

    @GetMapping
    public List<POC> getAllPOCs() {
        return pocService.getAllPOCs();
    }

    @GetMapping("/{id}")
    public POC getPOCById(@PathVariable int id) {
        return pocService.getPOCById(id);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public List<POC> getPOCsByRestaurant(@PathVariable int restaurantId) {
        return pocService.getPOCsByRestaurant(restaurantId);
    }

    @PostMapping
    public POC createPOC(@RequestBody POC poc) {
        return pocService.createPOC(poc);
    }

    @PutMapping("/{id}")
    public POC updatePOC(@PathVariable int id, @RequestBody POC poc) {
        return pocService.updatePOC(id, poc);
    }

    @DeleteMapping("/{id}")
    public void deletePOC(@PathVariable int id) {
        pocService.deletePOC(id);
    }
}
