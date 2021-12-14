package com.company;

public class Vehicle {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
    int getMaxSpeed() {
        return this.maxspeed;
    }
    int getWheels() {
        return this.wheels;
    }
    void setWheels(int wheels) {
        if ((wheels < 1) || (wheels > 24)) {
            System.out.println("Неверно указано количество колёс");
            return;}
        this.wheels = wheels;
    }
}
