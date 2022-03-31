package com.engeto.lesson02hotel;

import java.time.LocalDate;

public class Guest {
    String firstName;
    String lastName;
    LocalDate born;

    public Guest(String firstName, String lastName, LocalDate born) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.born = born;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getDescription() {
        return getFullName() + "(" + born.toString() + ")";
    }
}
