package com.engeto.elearning.companycars;

import java.time.LocalDate;
import java.util.ArrayList;

public class CompanyCars {
    ArrayList<Car> companyCars = new ArrayList<Car>();

    public void addCar(Car newCar) {
        companyCars.add(newCar);
    }

    public void removeCar(Car removedCar) {
        companyCars.remove(removedCar);
    }

    public void technicalCheckNextMonth() {
        System.out.println("Technical check this month:");
        for (Car eachCar : companyCars) {
            if (eachCar.lastTechnicalCheck.isBefore(LocalDate.of(2021, 5,1))) {
                System.out.println("-" + " " + eachCar.make + " " + eachCar.type + " " + eachCar.vehicleRegistrationType);
            }
        }
    }

    public void allCars() {
        System.out.println("\n\n");
        for (Car eachCar : companyCars) {
            System.out.println("-" + " " + eachCar.make + " " + eachCar.type + " " + eachCar.vehicleRegistrationType);
        }
    }
}
