package main.Java.OOPS.gcr_codebase.Interfaces;

interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data reset successfully.");
    }
}

interface Reportable {

    void generateReport();
}

interface Notifiable {

    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged.");
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness Report Generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Workout Reminder Sent.");
    }
}

public class FitnessTracker {

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}