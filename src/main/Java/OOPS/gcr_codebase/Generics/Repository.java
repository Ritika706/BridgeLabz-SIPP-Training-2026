package main.Java.OOPS.gcr_codebase.Generics;

import java.util.ArrayList;

public class Repository<T> {

    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {
        System.out.println(data);
    }
}