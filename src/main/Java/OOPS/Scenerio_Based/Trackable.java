interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
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
        System.out.println("Activity Logged: 5000 Steps Walked");
    }

    @Override
    public void generateReport() {
        System.out.println("Report: Calories Burned = 300");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Time to Drink Water!");
    }
}

public class Main {

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();

        System.out.println("\nMultiple Interface Implementation Successful!");
        System.out.println("FitnessDevice implements Trackable, Reportable and Notifiable.");
        System.out.println("Java allows multiple interface implementation but not multiple class inheritance.");
    }
}