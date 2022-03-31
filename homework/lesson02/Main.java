package com.engeto.lesson02hotel;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Guest adela = new Guest("Adela", "Malikova", LocalDate.of(1993, 3, 6));
        Guest jan = new Guest("Jan", "Dvoracek", LocalDate.of(1985, 8, 17));

        System.out.println(adela.getDescription());
        System.out.println(jan.getDescription());

        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);

        Room[] rooms = {room1, room2, room3};
        for (Room room : rooms) {
            System.out.println(room.getDescription());
        }

        Booking onlyAdela = new Booking(room1, adela, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), TypeOfStay.WORKING);
        Booking both = new Booking(room3, jan, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), TypeOfStay.HOLIDAY);
        both.addGuest(adela);

        ListOfBookings myBookings = new ListOfBookings();
        myBookings.addBooking(onlyAdela);
        myBookings.addBooking(both);

        myBookings.printList();


    }
}
