package com.fssa.smartbus.service;

import com.fssa.smartbus.model.Bus;
import com.fssa.smartbus.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    // Get all buses
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    // Get bus by ID
    public Optional<Bus> getBusById(Long id) {
        return busRepository.findById(id);
    }

    // Add new bus
    public Bus saveBus(Bus bus) {
        return busRepository.save(bus);
    }

    // Update bus details
    public Bus updateBus(Bus existingBus, Bus updatedBus) {
        existingBus.setName(updatedBus.getName());
        existingBus.setBustype(updatedBus.getBustype());
        existingBus.setFromLocation(updatedBus.getFromLocation());
        existingBus.setToLocation(updatedBus.getToLocation());
        existingBus.setDepartureTime(updatedBus.getDepartureTime());
        existingBus.setDepartureDate(updatedBus.getDepartureDate());
        existingBus.setArrivalTime(updatedBus.getArrivalTime());
        existingBus.setArrivalDate(updatedBus.getArrivalDate());
        existingBus.setDuration(updatedBus.getDuration());
        existingBus.setFare(updatedBus.getFare());
        existingBus.setSeats(updatedBus.getSeats());
        existingBus.setWaterBottle(updatedBus.isWaterBottle());
        existingBus.setBlankets(updatedBus.isBlankets());
        existingBus.setChargingPoint(updatedBus.isChargingPoint());
        existingBus.setBoardingPoint(updatedBus.getBoardingPoint());
        existingBus.setDroppingPoint(updatedBus.getDroppingPoint());

        return busRepository.save(existingBus);
    }

    // Delete bus
    public void deleteBus(Long id) {
        busRepository.deleteById(id);
    }
}
