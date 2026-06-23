package main.Java.coreJavaPractice.Scenario_Based.HOSPITAL_BILLING;
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class billing {
    static void makePayment(double billAmount, double paidAmount)
            throws InsufficientFundsException {

        if (paidAmount < billAmount) {
            throw new InsufficientFundsException("Payment Failed: Insufficient Funds");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] patients = {"Ritika", "Aman", "Priya"};

        try {
            System.out.print("Enter total bill: ");
            double bill = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());

            double costPerItem = bill / items;
            System.out.println("Cost per item: " + costPerItem);

            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient: " + patients[index]);

            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            makePayment(bill, payment);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("System Closed");
        }
    }
}
