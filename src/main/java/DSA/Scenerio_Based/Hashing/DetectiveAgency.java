package main.java.DSA.Scenerio_Based.Hashing;


import java.util.*;

public class DetectiveAgency {

    private HashMap<String, List<String>> suspectCases = new HashMap<>();

    // Add suspect and case
    public void addCase(String suspect, String caseName) {

        suspectCases.putIfAbsent(suspect, new ArrayList<>());
        suspectCases.get(suspect).add(caseName);
    }

    // Display all suspects
    public void display() {

        for (String suspect : suspectCases.keySet()) {
            System.out.println(suspect + " -> " + suspectCases.get(suspect));
        }
    }

    // Most investigated suspect
    public void mostInvestigatedSuspect() {

        String ans = "";
        int max = 0;

        for (String suspect : suspectCases.keySet()) {

            int count = suspectCases.get(suspect).size();

            if (count > max) {
                max = count;
                ans = suspect;
            }
        }

        System.out.println("\nMost Investigated Suspect : " + ans);
    }

    // Suspects involved in exactly 2 cases
    public void exactlyTwoCases() {

        System.out.println("\nSuspects in Exactly 2 Cases");

        for (String suspect : suspectCases.keySet()) {

            if (suspectCases.get(suspect).size() == 2) {
                System.out.println(suspect);
            }
        }
    }

    // Pair of suspects with identical case lists
    public void alwaysSeenTogether() {

        System.out.println("\nPairs Always Seen Together");

        List<String> suspects = new ArrayList<>(suspectCases.keySet());

        for (int i = 0; i < suspects.size(); i++) {

            for (int j = i + 1; j < suspects.size(); j++) {

                if (suspectCases.get(suspects.get(i))
                        .equals(suspectCases.get(suspects.get(j)))) {

                    System.out.println(
                            suspects.get(i) + " & " + suspects.get(j));
                }
            }
        }
    }

    public static void main(String[] args) {

        DetectiveAgency agency = new DetectiveAgency();

        agency.addCase("John", "Case1");
        agency.addCase("John", "Case2");
        agency.addCase("John", "Case3");

        agency.addCase("David", "Case1");
        agency.addCase("David", "Case2");

        agency.addCase("Alex", "Case1");
        agency.addCase("Alex", "Case2");

        agency.addCase("Smith", "Case5");

        agency.display();

        agency.mostInvestigatedSuspect();

        agency.exactlyTwoCases();

        agency.alwaysSeenTogether();
    }
}
