public class Main {

    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Ritika",
                21,
                101,
                9.2,
                "Artificial Intelligence"
        );

        System.out.println(gs);

        // IS-A Relationship
        Person p = gs;
        Student s = gs;

        System.out.println("\nIS-A Relationship:");
        System.out.println("GradStudent IS-A Student : " + (gs instanceof Student));
        System.out.println("GradStudent IS-A Person  : " + (gs instanceof Person));
        System.out.println("Student IS-A Person      : " + (s instanceof Person));
    }
}