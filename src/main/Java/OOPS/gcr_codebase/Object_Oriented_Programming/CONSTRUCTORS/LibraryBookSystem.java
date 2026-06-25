package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CONSTRUCTORS;

class Books {

    String title;
    String author;
    double price;
    boolean available;

    Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Book Not Available");
        }
    }
}

public class LibraryBookSystem {

    public static void main(String[] args) {

        Books b = new Books("Java", "James", 500);

        b.borrowBook();
    }
}