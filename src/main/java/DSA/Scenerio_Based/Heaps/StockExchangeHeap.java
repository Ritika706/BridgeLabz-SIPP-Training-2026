package main.java.DSA.Scenerio_Based.Heaps;


import java.util.Collections;
import java.util.PriorityQueue;

public class StockExchangeHeap {

    int[] heap;
    int size;

    public StockExchangeHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    // Insert into Max Heap
    public void insert(int value) {

        heap[size] = value;
        int current = size;
        size++;

        while (current > 0) {

            int parent = (current - 1) / 2;

            if (heap[parent] < heap[current]) {

                int temp = heap[parent];
                heap[parent] = heap[current];
                heap[current] = temp;

                current = parent;

            } else {
                break;
            }
        }
    }

    // Delete Maximum Element
    public int deleteMax() {

        if (size == 0)
            return -1;

        int max = heap[0];

        heap[0] = heap[size - 1];
        size--;

        heapify(0);

        return max;
    }

    // Heapify
    public void heapify(int index) {

        int largest = index;

        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && heap[left] > heap[largest])
            largest = left;

        if (right < size && heap[right] > heap[largest])
            largest = right;

        if (largest != index) {

            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;

            heapify(largest);
        }
    }

    // Display Heap
    public void display() {

        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");

        System.out.println();
    }

    // Top-K using PriorityQueue
    public static void topKCompanies(int[] marketCap, int k) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int value : marketCap)
            pq.offer(value);

        System.out.println("\nTop " + k + " Companies");

        while (k-- > 0 && !pq.isEmpty())
            System.out.print(pq.poll() + " ");
    }

    public static void main(String[] args) {

        StockExchangeHeap heap =
                new StockExchangeHeap(20);

        int companies[] =
                {70,40,90,20,10,80,60,30,100};

        for (int x : companies)
            heap.insert(x);

        System.out.println("Max Heap");

        heap.display();

        System.out.println("\nDelete Max = "
                + heap.deleteMax());

        heap.display();

        topKCompanies(companies,3);
    }
}