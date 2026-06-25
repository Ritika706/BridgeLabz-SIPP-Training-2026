package main.Java.OOPS.gcr_codebase.Interfaces;

interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie() {
        System.out.println("Streaming Movie...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing Game...");
    }

    @Override
    public void showSubscriptionDetails() {

        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class MultiServiceSmartTV {

    public static void main(String[] args) {

        String[] movies = {
                "Avengers",
                "Inception",
                "Interstellar"
        };

        String[] games = {
                "FIFA",
                "PUBG",
                "Forza"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies:");

        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nGames:");

        for (String game : games) {
            System.out.println(game);
        }
    }
}