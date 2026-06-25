package main.Java.OOPS.gcr_codebase.Interfaces;

interface TextModeration {

    boolean checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("badword");
    }
}

interface SpamDetection {

    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam content is prohibited.");
    }
}

class ContentModerator
        implements TextModeration, SpamDetection {

    @Override
    public boolean checkOffensiveContent(String post) {

        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean checkSpam(String post) {

        return post.toLowerCase().contains("buy now");
    }

    @Override
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class AIBasedContentModerationPlatform {

    public static void main(String[] args) {

        String[] posts = {
                "Buy now and get 50% discount",
                "This contains badword content",
                "Learning Java Interfaces"
        };

        ContentModerator moderator =
                new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            if (moderator.checkSpam(post)) {
                System.out.println(post + " -> Spam Post");
            } else if (moderator.checkOffensiveContent(post)) {
                System.out.println(post + " -> Offensive Post");
            } else {
                System.out.println(post + " -> Valid Post");
            }
        }
    }
}