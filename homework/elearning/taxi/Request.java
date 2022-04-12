package com.engeto.taxi;

public class Request {
    int numberOfPassengers;
    double routeLength;

    public void setNumberOfPassengers(int passengers) throws TaxiException {
        if (passengers < 1) {
            throw new TaxiException(
                    "The number of passengers can't be lower than 1"
                    + " (you tried to add: " + passengers + ")");
        }

        this.numberOfPassengers = passengers;
    }

    public void setRouteLength(double routeLength) throws TaxiException {
        if (routeLength < 1) {
            throw new TaxiException(
                    "The length of the route can't be 0 or lower"
                    + " (you tried to type: " + routeLength + ")");
        }

        this.routeLength = routeLength;
    }

    public double getRouteLength() {
        return routeLength;
    }

    public int getNumberOfPassengers() { return numberOfPassengers; }
}
