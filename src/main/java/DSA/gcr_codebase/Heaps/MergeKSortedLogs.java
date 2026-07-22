package main.java.DSA.gcr_codebase.Heaps;
import java.util.*;

public class MergeKSortedLogs {

    static class Node {

        int value;
        int listIndex;
        int elementIndex;

        Node(int value, int listIndex, int elementIndex) {
            this.value = value;
            this.listIndex = listIndex;
            this.elementIndex = elementIndex;
        }
    }

    public static void main(String[] args) {

        int[][] logs = {
                {2, 6, 10},
                {1, 5, 8},
                {3, 7, 9}
        };

        PriorityQueue<Node> pq = new PriorityQueue<>(
                (a, b) -> a.value - b.value
        );

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < logs.length; i++) {
            pq.add(new Node(logs[i][0], i, 0));
        }

        while (!pq.isEmpty()) {

            Node current = pq.poll();

            result.add(current.value);

            int nextIndex = current.elementIndex + 1;

            if (nextIndex < logs[current.listIndex].length) {

                pq.add(new Node(
                        logs[current.listIndex][nextIndex],
                        current.listIndex,
                        nextIndex
                ));
            }
        }

        System.out.println(result);
    }
}