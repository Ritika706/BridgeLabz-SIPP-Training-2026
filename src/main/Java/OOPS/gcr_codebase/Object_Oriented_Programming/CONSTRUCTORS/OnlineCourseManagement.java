package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CONSTRUCTORS;

class Course {

    String courseName;
    int duration;
    double fee;

    static String instituteName = "Cognizant Academy";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class OnlineCourseManagement {

    public static void main(String[] args) {

        Course c1 = new Course("Java", 3, 5000);

        c1.displayCourseDetails();

        Course.updateInstituteName("Deep Skilling");

        c1.displayCourseDetails();
    }
}