package main.Java.coreJavaPractice.gcr_codebase.JavaIO;

import java.io.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        try (
                BufferedReader br = new BufferedReader(new FileReader("students.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("reportCard.txt", true))
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);

                double average = (m1 + m2 + m3) / 3.0;

                bw.write("Name: " + name + ", Average: " + average);
                bw.newLine();
            }

            System.out.println("Report card generated successfully");

        } catch (FileNotFoundException e) {
            System.out.println("Student file not found");
        } catch (IOException e) {
            System.out.println("Error processing file");
        }
    }
}