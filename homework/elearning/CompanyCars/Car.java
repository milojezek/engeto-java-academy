package com.engeto.companycars;

import java.time.LocalDate;

public class Car {
    String make;
    String type;
    String vehicleRegistrationType;
    LocalDate lastTechnicalCheck;
    int mileage;

    public Car(String make, String type, String vehicleRegistrationType, LocalDate lastTechnicalCheck, int mileage) {
        this.make = make;
        this.type = type;
        this.vehicleRegistrationType = vehicleRegistrationType;
        this.lastTechnicalCheck = lastTechnicalCheck;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehicleRegistrationType() {
        return vehicleRegistrationType;
    }

    public void setVehicleRegistrationType(String vehicleRegistrationType) {
        this.vehicleRegistrationType = vehicleRegistrationType;
    }

    public LocalDate getLastTechnicalCheck() {
        return lastTechnicalCheck;
    }

    public void setLastTechnicalCheck(LocalDate lastTechnicalCheck) {
        this.lastTechnicalCheck = lastTechnicalCheck;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
