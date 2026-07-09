package main.Java.OOPS.gcr_codebase.CollectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassroomAttendanceTracker {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> attendance = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Smart Classroom Attendance Tracker =====");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Subject Name: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String student = sc.nextLine();

                    // Create subject if it doesn't exist
                    attendance.putIfAbsent(subject, new ArrayList<>());

                    ArrayList<String> students = attendance.get(subject);

                    if (students.contains(student)) {
                        System.out.println("Attendance already marked!");
                    } else {
                        students.add(student);
                        System.out.println("Attendance marked successfully.");
                    }
                    break;

                case 2:
                    if (attendance.isEmpty()) {
                        System.out.println("No attendance records found.");
                    } else {

                        for (Map.Entry<String, ArrayList<String>> entry : attendance.entrySet()) {

                            System.out.println("\nSubject: " + entry.getKey());

                            ArrayList<String> list = entry.getValue();

                            for (String s : list) {
                                System.out.println(s);
                            }

                            System.out.println("Total Students Present: " + list.size());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}