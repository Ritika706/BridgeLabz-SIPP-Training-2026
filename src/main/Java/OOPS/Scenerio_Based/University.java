class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    final int studentId;
    double gpa;

    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId +
                ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    String thesis;

    public GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Thesis: " + thesis;
    }
}

public class Main {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Ritika",
                21,
                101,
                9.1,
                "Artificial Intelligence"
        );

        System.out.println(gs);

        // Demonstrating IS-A relationship
        Person p = gs;
        Student s = gs;

        System.out.println("\nIS-A Relationship:");
        System.out.println("GradStudent IS-A Student : " + (gs instanceof Student));
        System.out.println("GradStudent IS-A Person  : " + (gs instanceof Person));
        System.out.println("Student IS-A Person      : " + (s instanceof Person));
    }
}