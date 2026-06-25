package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CONSTRUCTORS;

class Booked {

    String title;
    String author;
    double price;

    Booked() {
        title = "Java Basics";
        author = "James";
        price = 500;
    }

    Booked(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
}

public class BookDetails {

    public static void main(String[] args) {

        Booked b1 = new Booked();
        Booked b2 = new Booked("OOP", "Ritika", 700);

        b1.display();
        b2.display();
    }
}