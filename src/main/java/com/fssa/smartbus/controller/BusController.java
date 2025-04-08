package com.fssa.smartbus.controller;

import com.fssa.smartbus.model.Bus;
import com.fssa.smartbus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/buses")
@CrossOrigin(origins = "http://localhost:5500") // Adjust if needed
public class BusController {

    @Autowired
    private BusService busService;

    // Get All Buses
    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    // Get Bus by ID
    @GetMapping("/{id}")
    public ResponseEntity<Bus> getBusById(@PathVariable Long id) {
        Optional<Bus> bus = busService.getBusById(id);
        return bus.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Add a new Bus
    @PostMapping
    public ResponseEntity<Bus> createBus(@RequestBody Bus bus) {
        Bus savedBus = busService.saveBus(bus);
        return ResponseEntity.ok(savedBus);
    }

    // Update existing Bus
    @PutMapping("/{id}")
    public ResponseEntity<Bus> updateBus(@PathVariable Long id, @RequestBody Bus busDetails) {
        Optional<Bus> optionalBus = busService.getBusById(id);
        if (optionalBus.isPresent()) {
            Bus updatedBus = busService.updateBus(optionalBus.get(), busDetails);
            return ResponseEntity.ok(updatedBus);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete Bus
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBus(@PathVariable Long id) {
        Optional<Bus> optionalBus = busService.getBusById(id);
        if (optionalBus.isPresent()) {
            busService.deleteBus(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
