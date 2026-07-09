package main.Java.OOPS.gcr_codebase.CollectionsFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingSlot {

    public static void main(String[] args) {

        ArrayList<String> vehicles = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Smart Parking Slot Manager =====");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display All Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String vehicle = sc.nextLine();

                    if (vehicles.contains(vehicle)) {
                        System.out.println("Vehicle is already parked.");
                    } else {
                        vehicles.add(vehicle);
                        System.out.println("Vehicle added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Vehicle Registration Number: ");
                    vehicle = sc.nextLine();

                    if (vehicles.remove(vehicle)) {
                        System.out.println("Vehicle removed successfully.");
                    } else {
                        System.out.println("Vehicle not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Vehicle Registration Number: ");
                    vehicle = sc.nextLine();

                    if (vehicles.contains(vehicle)) {
                        System.out.println("Vehicle is currently parked.");
                    } else {
                        System.out.println("Vehicle is not parked.");
                    }
                    break;

                case 4:
                    if (vehicles.isEmpty()) {
                        System.out.println("No vehicles are parked.");
                    } else {
                        System.out.println("Parked Vehicles:");
                        for (String v : vehicles) {
                            System.out.println(v);
                        }
                    }

                    System.out.println("Total Occupied Parking Slots: " + vehicles.size());
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}