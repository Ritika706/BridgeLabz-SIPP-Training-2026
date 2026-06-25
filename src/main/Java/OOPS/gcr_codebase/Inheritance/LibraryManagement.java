package main.Java.OOPS.gcr_codebase.Inheritance;

class Book {

    protected String title;
    protected int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {

    private String name;
    private String bio;

    Author(String title,
           int publicationYear,
           String name,
           String bio) {

        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Author author =
                new Author(
                        "Java Programming",
                        2024,
                        "James Gosling",
                        "Creator of Java");

        author.displayInfo();
    }
}