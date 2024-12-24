package com.example.kam_backend.controllers;

import com.example.kam_backend.models.KAM;
import com.example.kam_backend.services.KAMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kams")
public class KAMController {

    @Autowired
    private KAMService kamService;

    @GetMapping
    public List<KAM> getAllKAMs() {
        return kamService.getAllKAMs();
    }

    @GetMapping("/{id}")
    public KAM getKAMById(@PathVariable int id) {
        return kamService.getKAMById(id);
    }

    @PostMapping
    public KAM createKAM(@RequestBody KAM kam) {
        return kamService.createKAM(kam);
    }

    @PutMapping("/{id}")
    public KAM updateKAM(@PathVariable int id, @RequestBody KAM kam) {
        return kamService.updateKAM(id, kam);
    }

    @DeleteMapping("/{id}")
    public void deleteKAM(@PathVariable int id) {
        kamService.deleteKAM(id);
    }
}