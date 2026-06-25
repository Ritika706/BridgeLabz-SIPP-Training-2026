package main.Java.OOPS.gcr_codebase.Encapsulation;

abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class Car extends Vehicle {

    private double dailyRate;

    public Car(String number, String type, double dailyRate) {
        super(number, type);
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {

    private double dailyRate;

    public Bike(String number, String type, double dailyRate) {
        super(number, type);
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    public Truck(String number, String type,
                 double dailyRate,
                 double loadingCharge) {
        super(number, type);
        this.dailyRate = dailyRate;
        this.loadingCharge = loadingCharge;
    }

    @Override
    double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Car car = new Car("UP81AB1234", "Car", 2000);
        Bike bike = new Bike("UP81CD5678", "Bike", 500);
        Truck truck = new Truck("UP81EF9999", "Truck", 4000, 1500);

        car.displayDetails();
        System.out.println("Rental Cost: " + car.calculateRentalCost(3));

        System.out.println();

        bike.displayDetails();
        System.out.println("Rental Cost: " + bike.calculateRentalCost(3));

        System.out.println();

        truck.displayDetails();
        System.out.println("Rental Cost: " + truck.calculateRentalCost(3));
    }
}