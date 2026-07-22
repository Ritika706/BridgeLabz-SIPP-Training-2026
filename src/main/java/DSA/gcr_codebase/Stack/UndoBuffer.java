package main.java.DSA.gcr_codebase.Stack;

class UndoBuffer {

    int[] arr;
    int top;
    int capacity;

    UndoBuffer(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    // Push
    public void push(int value) {

        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }

        arr[++top] = value;
        System.out.println(value + " pushed.");
    }

    // Pop
    public void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
            return;
        }

        System.out.println(arr[top] + " popped.");
        top--;
    }

    // Peek
    public void peek() {

        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Top element: " + arr[top]);
    }

    // Display
    public void display() {

        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        UndoBuffer stack = new UndoBuffer(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.push(60); // Overflow

        stack.display();

        stack.peek();

        stack.pop();
        stack.pop();

        stack.display();

        stack.peek();
    }
}