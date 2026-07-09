package main.Java.OOPS.gcr_codebase.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

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

        stack.display();

        System.out.println("Popped: " + stack.pop());

        stack.display();

        System.out.println();

        // Generic Method
        Integer[] arr = {10, 25, 50, 15, 40};
        System.out.println("Maximum Number: " + Utility.findMax(arr));

        String[] names = {"Aman", "Ritika", "Karan"};
        System.out.println("Maximum String: " + Utility.findMax(names));

        System.out.println();

        // Repository
        Repository<String> repo = new Repository<>();
        repo.add("Java");
        repo.add("Python");
        repo.add("C++");

        repo.display();

        System.out.println();

        // Wildcard
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        Utility.printList(list);
    }
}