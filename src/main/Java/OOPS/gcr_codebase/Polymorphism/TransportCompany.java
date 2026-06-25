package main.Java.OOPS.gcr_codebase.Polymorphism;

class Vehicle {

    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 2;
    }
}

public class TransportCompany {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        for (Vehicle vehicle : vehicles) {

            System.out.println(
                    vehicle.getClass().getSimpleName()
                            + " Fuel Cost = "
                            + vehicle.fuelCost(100)
            );

            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
            }
        }
    }
}