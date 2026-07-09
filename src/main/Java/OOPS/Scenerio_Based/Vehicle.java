class Vehicle {

    public double fuelCost(double km) {
        return 0;
    }
}

class Car extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 3;
    }
}

// New class added without modifying existing classes
class ElectricCar extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 2;
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        double km = 50;

        for (Vehicle v : fleet) {

            System.out.println("Vehicle: " + v.getClass().getSimpleName());
            System.out.println("Fuel Cost for " + km + " km = " + v.fuelCost(km));

            // Using instanceof before casting
            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("This is a Car.");
            } else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("This is a Bus.");
            } else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("This is a Bike.");
            } else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("This is an Electric Car.");
            }

            System.out.println();
        }
    }
}