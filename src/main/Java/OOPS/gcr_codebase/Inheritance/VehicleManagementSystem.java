package main.Java.OOPS.gcr_codebase.Inheritance;

class Vehicle {

    protected int maxSpeed;
    protected String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed);
    }
}

interface Refuelable {

    void refuel();
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Electric Vehicle Charging...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol Vehicle Refueling...");
    }
}

public class VehicleManagementSystem {

    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle(180, "Tesla");

        PetrolVehicle pv =
                new PetrolVehicle(220, "Honda City");

        ev.displayDetails();
        ev.charge();

        System.out.println();

        pv.displayDetails();
        pv.refuel();
    }
}