package main.Java.coreJavaPractice.Core_Java.gcr_codebase.Programming_Elements.LEVEL1;

public class DiscountedFeeCalculator {
    public static void main(String[] args) {

        double fee = 125000;
        double discountPercent = 10;

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " +
                discount +
                " and final discounted fee is INR " +
                finalFee);
    }
}
