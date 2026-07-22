package main.java.DSA.gcr_codebase.Queue;

class CircularQueue {
    int[] arr;
    int front;
    int rear;
    int count;
    int capacity;

    CircularQueue(int size) {
        capacity = size;
        arr = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    void enqueue(int x) {
        if (count == capacity) {
            System.out.println("Queue Full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = x;
        count++;
    }

    void dequeue() {
        if (count == 0) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Removed " + arr[front]);
        front = (front + 1) % capacity;
        count--;
    }

    void display() {
        if (count == 0) {
            System.out.println("Queue Empty");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}