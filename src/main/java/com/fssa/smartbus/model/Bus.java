package com.fssa.smartbus.model;

import jakarta.persistence.*;

@Entity
@Table(name = "buses")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String bustype;
    private String fromLocation;
    private String toLocation;
    private String departureTime;
    private String departureDate;
    private String arrivalTime;
    private String arrivalDate;
    private String duration;
    private double fare;
    private int seats;
    private boolean waterBottle;
    private boolean blankets;
    private boolean chargingPoint;
    private String boardingPoint;
    private String droppingPoint;

    public Bus(Long id, String bustype, String name, String fromLocation,
               String toLocation, String departureTime, String departureDate, String arrivalDate,
               String arrivalTime, String duration, double fare, int seats, boolean waterBottle,
               boolean blankets, boolean chargingPoint, String boardingPoint, String droppingPoint) {
        this.id = id;
        this.bustype = bustype;
        this.name = name;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.departureTime = departureTime;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.duration = duration;
        this.fare = fare;
        this.seats = seats;
        this.waterBottle = waterBottle;
        this.blankets = blankets;
        this.chargingPoint = chargingPoint;
        this.boardingPoint = boardingPoint;
        this.droppingPoint = droppingPoint;
    }

    public Bus() {
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getBustype() {
        return bustype;
    }

    public void setBustype(String bustype) {
        this.bustype = bustype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isWaterBottle() {
        return waterBottle;
    }

    public void setWaterBottle(boolean waterBottle) {
        this.waterBottle = waterBottle;
    }

    public boolean isBlankets() {
        return blankets;
    }

    public void setBlankets(boolean blankets) {
        this.blankets = blankets;
    }

    public boolean isChargingPoint() {
        return chargingPoint;
    }

    public void setChargingPoint(boolean chargingPoint) {
        this.chargingPoint = chargingPoint;
    }

    public String getBoardingPoint() {
        return boardingPoint;
    }

    public void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    public String getDroppingPoint() {
        return droppingPoint;
    }

    public void setDroppingPoint(String droppingPoint) {
        this.droppingPoint = droppingPoint;
    }
}