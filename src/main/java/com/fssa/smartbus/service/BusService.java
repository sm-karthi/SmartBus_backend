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

    // Save Bus
    public Bus saveBus(Bus bus) {
        return busRepository.save(bus);
    }

    // Get all buses
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    // Get a bus by ID
    public Optional<Bus> getBusById(Long id) {
        return busRepository.findById(id);
    }

    // Delete a bus by ID
    public void deleteBus(Long id) {
        busRepository.deleteById(id);
    }

    // Update Bus (used in controller)
    public Bus updateBus(Bus existingBus, Bus busDetails) {
        existingBus.setName(busDetails.getName());
        existingBus.setBustype(busDetails.getBustype());
        existingBus.setFromLocation(busDetails.getFromLocation());
        existingBus.setToLocation(busDetails.getToLocation());
        existingBus.setDepartureTime(busDetails.getDepartureTime());
        existingBus.setDepartureDate(busDetails.getDepartureDate());
        existingBus.setArrivalTime(busDetails.getArrivalTime());
        existingBus.setArrivalDate(busDetails.getArrivalDate());
        existingBus.setDuration(busDetails.getDuration());
        existingBus.setFare(busDetails.getFare());
        existingBus.setSeats(busDetails.getSeats());
        existingBus.setWaterBottle(busDetails.isWaterBottle());
        existingBus.setBlankets(busDetails.isBlankets());
        existingBus.setChargingPoint(busDetails.isChargingPoint());
        existingBus.setBoardingPoint(busDetails.getBoardingPoint());
        existingBus.setDroppingPoint(busDetails.getDroppingPoint());
        return busRepository.save(existingBus);
    }
}
