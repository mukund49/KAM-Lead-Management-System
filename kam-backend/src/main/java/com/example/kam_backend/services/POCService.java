package com.example.kam_backend.services;

import com.example.kam_backend.models.POC;
import com.example.kam_backend.repositories.POCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class POCService {

    @Autowired
    private POCRepository pocRepository;

    public List<POC> getAllPOCs() {
        return pocRepository.findAll();
    }

    public POC getPOCById(int id) {
        return pocRepository.findById(id).orElse(null);
    }

    public List<POC> getPOCsByRestaurant(int restaurantId) {
        return pocRepository.findByRestaurantId(restaurantId);
    }

    public POC createPOC(POC poc) {
        return pocRepository.save(poc);
    }

    public POC updatePOC(int id, POC poc) {
        if (pocRepository.existsById(id)) {
            poc.setId(id);
            return pocRepository.save(poc);
        }
        return null;
    }

    public void deletePOC(int id) {
        if (pocRepository.existsById(id)) {
            pocRepository.deleteById(id);
        }
    }
}
