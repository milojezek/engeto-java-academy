package com.engeto.hotel;

public class Room {
    int number;
    int beds;
    boolean hasBalcony;
    boolean seaView;
    double pricePerNight;

    public Room(int number, int beds, boolean hasBalcony, boolean seaView, double pricePerNight) {
        this.number = number;
        this.beds = beds;
        this.hasBalcony = hasBalcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getDescription() {
        return "The room number " + number + " has " + beds + " bed(s)" +
                " and costs " + pricePerNight + " CZK a night.";
    }

}
