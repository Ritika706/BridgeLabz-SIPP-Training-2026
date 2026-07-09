package main.Java.OOPS.gcr_codebase.CollectionsFramework;

import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " | " + phone + " | " + email;
    }
}

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> map = new HashMap<>();
    HashSet<String> phones = new HashSet<>();

    void add(String name, String phone, String email) {
        if (phones.contains(phone)) {
            System.out.println("Phone number already exists.");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phones.add(phone);

        System.out.println("Contact added.");
    }

    void search(String name) {
        Contact c = map.get(name);

        if (c != null)
            System.out.println(c);
        else
            System.out.println("Contact not found.");
    }

    void delete(String name) {
        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phones.remove(c.phone);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    void display() {
        Collections.sort(contacts, new Comparator<Contact>() {
            public int compare(Contact c1, Contact c2) {
                return c1.name.compareToIgnoreCase(c2.name);
            }
        });

        System.out.println("\nContacts:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();

        book.add("John", "9876543210", "john@gmail.com");
        book.add("Alice", "9123456780", "alice@gmail.com");
        book.add("Bob", "9988776655", "bob@gmail.com");

        book.add("Tom", "9876543210", "tom@gmail.com");

        book.search("Alice");

        book.delete("Bob");

        book.display();
    }
}