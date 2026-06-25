package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CLASS_AND_OBJ;

class Employ {

    String name;
    int id;
    double salary;

    Employ(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class Employeeinfo {

    public static void main(String[] args) {

        Employ emp1 = new Employ("Ritika", 101, 50000);

        emp1.displayDetails();
    }
}