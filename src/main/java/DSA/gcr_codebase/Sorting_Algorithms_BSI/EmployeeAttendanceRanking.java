package main.java.DSA.gcr_codebase.Sorting_Algorithms_BSI;

import java.util.Arrays;

class Employee {
    int id;
    int attendance;

    public Employee(int id, int attendance) {
        this.id = id;
        this.attendance = attendance;
    }
}

public class EmployeeAttendanceRanking {

    // Method to find Top K Employees
    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int k) {

        int n = employeeIds.length;
        Employee[] employees = new Employee[n];

        // Store data in Employee objects
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee(employeeIds[i], attendance[i]);
        }

        // Sort:
        // 1. Higher attendance first
        // 2. Smaller Employee ID if attendance is same
        Arrays.sort(employees, (e1, e2) -> {

            if (e1.attendance != e2.attendance) {
                return e2.attendance - e1.attendance;
            }

            return e1.id - e2.id;
        });

        // Store Top K IDs
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = employees[i].id;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};

        int k = 3;

        int[] topEmployees = topKEmployees(employeeIds, attendance, k);

        System.out.println("Employee IDs      : " + Arrays.toString(employeeIds));
        System.out.println("Attendance (%)    : " + Arrays.toString(attendance));
        System.out.println("Top " + k + " Employees : " + Arrays.toString(topEmployees));
    }
}