import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Phone: " + phone +
                ", Email: " + email;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();
        HashMap<String, Contact> contactMap = new HashMap<>();
        HashSet<String> phoneNumbers = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Address Book =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    if (phoneNumbers.contains(phone)) {
                        System.out.println("Duplicate Phone Number! Contact not added.");
                        break;
                    }

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Contact c = new Contact(name, phone, email);

                    contacts.add(c);
                    contactMap.put(name, c);
                    phoneNumbers.add(phone);

                    System.out.println("Contact Added Successfully.");
                    break;

                case 2:
                    System.out.print("Enter Name to Search: ");
                    name = sc.nextLine();

                    if (contactMap.containsKey(name)) {
                        System.out.println(contactMap.get(name));
                    } else {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Delete: ");
                    name = sc.nextLine();

                    if (contactMap.containsKey(name)) {

                        Contact remove = contactMap.remove(name);
                        contacts.remove(remove);
                        phoneNumbers.remove(remove.phone);

                        System.out.println("Contact Deleted Successfully.");
                    } else {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 4:

                    Collections.sort(contacts, new Comparator<Contact>() {
                        @Override
                        public int compare(Contact c1, Contact c2) {
                            return c1.name.compareToIgnoreCase(c2.name);
                        }
                    });

                    if (contacts.isEmpty()) {
                        System.out.println("No Contacts Available.");
                    } else {
                        System.out.println("\nContacts:");
                        for (Contact contact : contacts) {
                            System.out.println(contact);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}