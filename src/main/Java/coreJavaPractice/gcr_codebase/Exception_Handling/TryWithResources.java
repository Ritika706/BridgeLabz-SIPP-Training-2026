package main.Java.coreJavaPractice.gcr_codebase.Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            System.out.println(br.readLine());

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}