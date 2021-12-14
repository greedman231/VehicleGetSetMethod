package com.company;

public class VehicleGetSetMethod {

    public static void main(String[] args) {
        Vehicle ferrari = new Vehicle(2, -2, 360, 12);
        System.out.println("Макс скорость:"  + ferrari.getMaxSpeed() + "км/ч");
        System.out.println("Число колёс:" + ferrari.getWheels());

        ferrari.setWheels (4) ;
        System.out.println("Число колёс(повторно)" + ferrari.getWheels());
    }
}
