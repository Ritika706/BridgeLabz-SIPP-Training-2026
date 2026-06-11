package main.Java.coreJavaPractice.gcr_codebase.Programming_Elements.LEVEL2;

import java.util.Scanner;

public class PurchasePriceCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("Total Purchase Price = " + totalPrice);

        input.close();
    }
}