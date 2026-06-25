package main.Java.OOPS.gcr_codebase.Inheritance;

class Person {

    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Age = " + age;
    }
}

class Student extends Person {

    protected final int studentId;
    protected double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Student ID = " + studentId
                + ", GPA = " + gpa;
    }
}

class GradStudent extends Student {

    private String thesis;

    GradStudent(String name, int age,
                int studentId,
                double gpa,
                String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Thesis = " + thesis;
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        GradStudent student =
                new GradStudent(
                        "Ritika",
                        22,
                        101,
                        9.1,
                        "Artificial Intelligence");

        System.out.println(student);

        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
    }
}