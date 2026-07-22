package main.java.DSA.Scenerio_Based.Graphs;

import java.util.*;

public class CityNavigation {

    private int V;
    private ArrayList<ArrayList<Integer>> graph;

    public CityNavigation(int V) {
        this.V = V;
        graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());
    }

    // Add Road
    public void addEdge(int src, int dest) {
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    // ---------------- BFS ----------------

    public void bfs(int source) {

        boolean visited[] = new boolean[V];

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(source);

        visited[source] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            System.out.print(node + " ");

            for (int next : graph.get(node)) {

                if (!visited[next]) {

                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }

    // -------- Shortest Path ------------

    public void shortestPath(int source, int destination) {

        boolean visited[] = new boolean[V];

        int parent[] = new int[V];

        Arrays.fill(parent, -1);

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(source);

        visited[source] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            for (int next : graph.get(node)) {

                if (!visited[next]) {

                    visited[next] = true;

                    parent[next] = node;

                    queue.offer(next);
                }
            }
        }

        List<Integer> path = new ArrayList<>();

        int current = destination;

        while (current != -1) {

            path.add(current);

            current = parent[current];
        }

        Collections.reverse(path);

        System.out.println(path);
    }

    // ---------------- DFS ----------------

    public void dfs(int node, boolean visited[]) {

        visited[node] = true;

        System.out.print(node + " ");

        for (int next : graph.get(node))

            if (!visited[next])

                dfs(next, visited);
    }

    // ----------- All Paths -------------

    public void allPaths(int source,
                         int destination,
                         boolean visited[],
                         ArrayList<Integer> path) {

        visited[source] = true;

        path.add(source);

        if (source == destination) {

            System.out.println(path);

        } else {

            for (int next : graph.get(source)) {

                if (!visited[next])

                    allPaths(next,
                            destination,
                            visited,
                            path);
            }
        }

        path.remove(path.size() - 1);

        visited[source] = false;
    }

    // -------- Connected Components ----------

    public void connectedComponents() {

        boolean visited[] = new boolean[V];

        int components = 0;

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                components++;

                dfs(i, visited);

                System.out.println();
            }
        }

        System.out.println("Total Components = "
                + components);
    }

    // ---------- Cycle Detection -------------

    public boolean hasCycleDirected(int node,
                                    boolean visited[],
                                    boolean recursion[]) {

        visited[node] = true;

        recursion[node] = true;

        for (int next : graph.get(node)) {

            if (!visited[next]) {

                if (hasCycleDirected(next,
                        visited,
                        recursion))

                    return true;
            }

            else if (recursion[next])

                return true;
        }

        recursion[node] = false;

        return false;
    }

    public static void main(String[] args) {

        CityNavigation city =
                new CityNavigation(10);

        city.addEdge(0,1);
        city.addEdge(0,2);
        city.addEdge(1,3);
        city.addEdge(1,4);
        city.addEdge(2,5);
        city.addEdge(5,6);
        city.addEdge(6,7);
        city.addEdge(7,8);
        city.addEdge(8,9);

        System.out.println("BFS");

        city.bfs(0);

        System.out.println("\n");

        System.out.println("Shortest Path");

        city.shortestPath(0,9);

        System.out.println("\nDFS");

        city.dfs(0,new boolean[10]);

        System.out.println("\n");

        System.out.println("All Paths");

        city.allPaths(0,
                4,
                new boolean[10],
                new ArrayList<>());

        System.out.println();

        city.connectedComponents();

        boolean cycle =
                city.hasCycleDirected(0,
                        new boolean[10],
                        new boolean[10]);

        System.out.println("Directed Cycle = "
                + cycle);

    }
}