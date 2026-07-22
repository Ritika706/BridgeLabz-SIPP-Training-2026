package main.java.DSA.gcr_codebase.Stack;

class Node {
    String functionName;
    Node next;

    Node(String functionName) {
        this.functionName = functionName;
        this.next = null;
    }
}

public class CallStack {

    Node top;

    // Push (Function Call)
    public void push(String functionName) {
        Node newNode = new Node(functionName);

        // New node points to current top
        newNode.next = top;

        // Update top
        top = newNode;

        System.out.println(functionName + " called.");
    }

    // Pop (Function Return)
    public String pop() {

        if (top == null) {
            System.out.println("Call stack is empty.");
            return null;
        }

        String function = top.functionName;
        top = top.next;

        return function;
    }

    // Peek (Current Function)
    public void peek() {

        if (top == null) {
            System.out.println("Call stack is empty.");
            return;
        }

        System.out.println("Currently Executing: " + top.functionName);
    }

    // Display Stack
    public void display() {

        if (top == null) {
            System.out.println("Call stack is empty.");
            return;
        }

        Node temp = top;

        System.out.print("Call Stack: ");

        while (temp != null) {
            System.out.print(temp.functionName);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validateUser()");
        stack.push("checkPassword()");

        stack.display();

        stack.peek();

        System.out.println("Returned from: " + stack.pop());

        stack.display();

        stack.peek();
    }
}