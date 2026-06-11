package main.Java.coreJavaPractice.gcr_codebase.Programming_Elements.LEVEL1;

public class EarthVolumeCalculator {
    public static void main(String[] args) {

        double radius = 6378;
        double pi = Math.PI;

        double volumeKm =
                (4.0 / 3.0) * pi * Math.pow(radius, 3);

        double volumeMiles =
                volumeKm / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is "
                + volumeKm);

        System.out.println("The volume of earth in cubic miles is "
                + volumeMiles);
    }
}