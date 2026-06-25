package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CONSTRUCTORS;

class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {
        customerName = "Guest";
        carModel = "Swift";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * 1500;
    }
}

public class CarRentalSystem {

    public static void main(String[] args) {

        CarRental c =
                new CarRental("Ritika", "Creta", 5);

        System.out.println("Total Cost = " + c.calculateCost());
    }
}