package com.engeto.platformProject.companycars;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Skoda", "Octavia", "1A23425", LocalDate.of(2021, 2 , 12), 98405);
        Car car2 = new Car("Opel", "Astra", "4T67788", LocalDate.of(2022, 5, 13), 161914);
        Car car3 = new Car("Renault", "Megane", "2B38736", LocalDate.of(2022, 5, 23), 157352);

        CompanyCars carFleet = new CompanyCars();
        carFleet.addCar(car1);
        carFleet.addCar(car2);
        carFleet.addCar(car3);

        carFleet.technicalCheckNextMonth();

        for (int i = 1; i <= 20; i++) {
            Car newCar = new Car("Hyundai", "i40", "ENGETO" + "-" + String.format("%02d",i), LocalDate.now(), 40);
            carFleet.addCar(newCar);
        }

        carFleet.allCars();
    }
}
