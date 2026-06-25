package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CONSTRUCTORS;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class PersonCopy {

    public static void main(String[] args) {

        Person p1 = new Person("Ritika", 21);
        Person p2 = new Person(p1);

        p2.display();
    }
}