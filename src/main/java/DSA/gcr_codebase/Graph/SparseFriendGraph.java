package main.java.DSA.gcr_codebase.Graph;


import java.util.*;

public class SparseFriendGraph {

    private Map<Integer, Set<Integer>> graph = new HashMap<>();

    public void addFriendship(int u, int v) {
        graph.computeIfAbsent(u, k -> new HashSet<>()).add(v);
        graph.computeIfAbsent(v, k -> new HashSet<>()).add(u);
    }

    public boolean isFriend(int u, int v) {
        return graph.getOrDefault(u, Collections.emptySet()).contains(v);
    }

    public static void main(String[] args) {

        SparseFriendGraph g = new SparseFriendGraph();

        g.addFriendship(1,2);
        g.addFriendship(1,3);
        g.addFriendship(2,4);

        System.out.println(g.isFriend(1,2));
        System.out.println(g.isFriend(1,4));
    }
}