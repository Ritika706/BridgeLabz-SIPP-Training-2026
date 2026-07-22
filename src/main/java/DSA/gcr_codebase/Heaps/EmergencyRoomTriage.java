package main.java.DSA.gcr_codebase.Heaps;

import java.util.*;

public class EmergencyRoomTriage {
    public static void main(String[] args) {

        // Creating Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Adding patients with severity scores
        pq.add(5);
        pq.add(9);
        pq.add(3);
        pq.add(10);
        pq.add(7);

        System.out.println("Patients waiting (severity): " + pq);

        // Treating patients based on highest severity
        while (!pq.isEmpty()) {
            int severePatient = pq.poll(); // removes maximum severity patient
            System.out.println("Treat patient with severity: " + severePatient);
        }
    }
}