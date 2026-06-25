package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CONSTRUCTORS;

class Circle {

    double radius;

    Circle() {
        this(5);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius = " + radius);
    }
}

public class CircleConstructor {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(10);

        c1.display();
        c2.display();
    }
}