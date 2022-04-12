package com.engeto.hotel;

import java.awt.print.Book;
import java.util.ArrayList;

public class ListOfBookings {
    ArrayList<Booking> bookings = new ArrayList<Booking>();

    public void addBooking(Booking newBooking) {
        bookings.add(newBooking);
    }

    public void removeBooking(Booking removedBooking) {
        bookings.remove(removedBooking);
    }

    public void printList() {
        System.out.println("\nThe list of bookings:");
        for (Booking booking : bookings) {
            System.out.println(booking.getDescription());
        }
    }
}
