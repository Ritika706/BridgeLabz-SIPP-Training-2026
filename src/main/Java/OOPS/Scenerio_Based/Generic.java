import java.util.*;

// Generic Pair Class
class Pair<T, U> {
    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("First = " + first);
        System.out.println("Second = " + second);
    }
}

// Generic Stack Class
class Stack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public void display() {
        System.out.println(stack);
    }
}

// Generic Repository Class
class Repository<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {
        System.out.println(data);
    }
}

// Utility Class
class Utility {

    // Generic Method with Comparable Bound
    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }

    // Wildcard Method
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Pair
        Pair<String, Integer> pair = new Pair<>("Ritika", 21);
        pair.display();

        System.out.println();

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack:");
        stack.display();

        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack After Pop:");
        stack.display();

        System.out.println();

        // findMax()
        Integer[] numbers = {10, 50, 25, 70, 40};
        System.out.println("Maximum Number = " + Utility.findMax(numbers));

        String[] names = {"Aman", "Ritika", "Karan"};
        System.out.println("Maximum String = " + Utility.findMax(names));

        System.out.println();

        // Repository
        Repository<String> repo = new Repository<>();
        repo.add("Java");
        repo.add("Python");
        repo.add("C++");

        System.out.println("Repository Data:");
        repo.display();

        System.out.println();

        // Wildcard List
        List<Double> marks = new ArrayList<>();
        marks.add(85.5);
        marks.add(90.0);
        marks.add(78.5);

        System.out.println("Printing List:");
        Utility.printList(marks);
    }
}