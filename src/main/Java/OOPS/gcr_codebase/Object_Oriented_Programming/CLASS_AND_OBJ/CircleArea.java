package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CLASS_AND_OBJ;

class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleArea {

    public static void main(String[] args) {

        Circle c = new Circle(5);

        System.out.println("Area = " + c.area());
        System.out.println("Circumference = " + c.circumference());
    }
}