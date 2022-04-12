package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    Room bookedRoom;
    Guest mainGuest;
    List<Guest> otherGuests = new ArrayList<Guest>();
    LocalDate startDate;
    LocalDate endDate;
    TypeOfStay type;

    public Booking(Room bookedRoom, Guest mainGuest, LocalDate startDate, LocalDate endDate, TypeOfStay type) {
        this.bookedRoom = bookedRoom;
        this.mainGuest = mainGuest;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
    }

    public void addGuest(Guest newGuest) {
        otherGuests.add(newGuest);
    }

    public void removeGuest(Guest guest) {
        otherGuests.remove(guest);
    }

    public Room getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(Room bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    public Guest getMainGuest() {
        return mainGuest;
    }

    public void setMainGuest(Guest mainGuest) {
        this.mainGuest = mainGuest;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public TypeOfStay getType() {
        return type;
    }

    public void setType(TypeOfStay type) {
        this.type = type;
    }

    public String getDescription() {
        String description = "Booking | " + mainGuest.getFullName() + " (" + type.toString().toLowerCase() + ") " +
                "*" + startDate.toString() + " > " + endDate.toString() + "* " +
                "Other guests: ";

        if (otherGuests.size() == 0) {
            description += "no";
        } else if (otherGuests.size() == 1) {
            description += otherGuests.get(0).getFullName();
        } else {
            String commaSeparatedList = otherGuests.toString();
            commaSeparatedList = commaSeparatedList.replace("[", "")
                    .replace("]", "");
            description += commaSeparatedList;
        }

        return description;
        }
    }
