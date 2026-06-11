package main.Java.coreJavaPractice.Scenario_Based.RAVI_SALARY;

public class ravi_salary {
    public static void main(String[] args) {
        // 1. Store Ravi's information using correct data types
        String name = "Ravi";
        int age = 22;
        char rank = 'A';
        double salary = 55000.00;
        float membershipFee = 150.50f;


        double bonusPercentage = 0.12;
        double calculatedBonus = salary * bonusPercentage;

        // 3. Cast the annual bonus to an int
        int annualBonus = (int) calculatedBonus;


        System.out.println("       WELCOME TO THE CODING GUILD       ");
        System.out.printf(" Member Name   : %s%n", name);
        System.out.printf(" Age           : %d%n", age);
        System.out.printf(" Guild Rank    : %c%n", rank);
        System.out.println("-----------------------------------------");
        System.out.printf(" Base Salary   : $%.2f%n", salary);
        System.out.printf(" Joined Fee    : $%.2f%n", membershipFee);
        System.out.printf(" Annual Bonus  : $%d (Cast to Integer)%n", annualBonus);

    }
}