package com.example.kam_backend.services;


import com.example.kam_backend.models.KAM;
import com.example.kam_backend.repositories.KAMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KAMService {

    @Autowired
    private KAMRepository kamRepository;

    public List<KAM> getAllKAMs() {
        return kamRepository.findAll();
    }

    public KAM getKAMById(int id) {
        return kamRepository.findById(id).orElse(null);
    }

    public KAM createKAM(KAM kam) {
        return kamRepository.save(kam);
    }

    public KAM updateKAM(int id, KAM kam) {
        if (kamRepository.existsById(id)) {
            kam.setId(id);
            return kamRepository.save(kam);
        }
        return null;
    }

    public void deleteKAM(int id) {
        if (kamRepository.existsById(id)) {
            kamRepository.deleteById(id);
        }
    }
}
