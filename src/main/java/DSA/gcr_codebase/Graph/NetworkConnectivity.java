package main.java.DSA.gcr_codebase.Graph;


import java.util.*;

public class NetworkConnectivity {

    static void dfs(Map<Integer,List<Integer>> graph,
                    int node,
                    Set<Integer> visited){

        visited.add(node);

        for(int next:graph.getOrDefault(node,
                Collections.emptyList())){

            if(!visited.contains(next))
                dfs(graph,next,visited);
        }
    }

    static int connectedComponents(
            Map<Integer,List<Integer>> graph,
            int n){

        Set<Integer> visited=new HashSet<>();

        int count=0;

        for(int i=0;i<n;i++){

            if(!visited.contains(i)){

                count++;

                dfs(graph,i,visited);
            }
        }

        return count;
    }

    public static void main(String[] args){

        Map<Integer,List<Integer>> graph=
                new HashMap<>();

        graph.put(0,List.of(1));
        graph.put(1,List.of(0));
        graph.put(2,List.of(3));
        graph.put(3,List.of(2));

        int c=connectedComponents(graph,4);

        System.out.println(c);

        if(c==1)
            System.out.println("Fully Connected");
        else
            System.out.println("Disconnected");
    }
}
