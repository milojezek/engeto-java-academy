package com.engeto.taxi;

public class Main {

    private static void printRequest(Request request) {
        System.out.println("The number of passengers: "
                + request.getNumberOfPassengers());
        System.out.println("The length of the route: "
                + request.getRouteLength());
    }

    public static void main(String[] args) {
        Request request = new Request();

        try {
            // First change is correct
            request.setNumberOfPassengers(3);
            request.setRouteLength(100);
            printRequest(request);

            // Second change throws a ernror
            request.setRouteLength(-5);

            // This code won't be executed
            // - it'll jump right to the error handling
            printRequest(request);
            request.setRouteLength(-5);
            printRequest(request);

        } catch (TaxiException ex) {
            System.err.println("Error: "
            + ex.getMessage());
        }
    }
}
