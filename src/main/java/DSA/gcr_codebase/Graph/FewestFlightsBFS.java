package main.java.DSA.gcr_codebase.Graph;


import java.util.*;

public class FewestFlightsBFS {

    public static List<Integer> shortestPath(
            Map<Integer,List<Integer>> graph,
            int src,
            int dest){

        Queue<Integer> q=new LinkedList<>();
        Map<Integer,Integer> parent=new HashMap<>();
        Set<Integer> visited=new HashSet<>();

        q.offer(src);
        visited.add(src);
        parent.put(src,null);

        while(!q.isEmpty()){

            int node=q.poll();

            if(node==dest)
                break;

            for(int next:graph.getOrDefault(node,
                    Collections.emptyList())){

                if(!visited.contains(next)){

                    visited.add(next);
                    parent.put(next,node);
                    q.offer(next);
                }
            }
        }

        if(!visited.contains(dest))
            return Collections.emptyList();

        LinkedList<Integer> path=new LinkedList<>();

        Integer cur=dest;

        while(cur!=null){

            path.addFirst(cur);
            cur=parent.get(cur);
        }

        return path;
    }

    public static void main(String[] args){

        Map<Integer,List<Integer>> graph=
                new HashMap<>();

        graph.put(0,List.of(1,2));
        graph.put(1,List.of(3));
        graph.put(2,List.of(3));
        graph.put(3,List.of(4));

        System.out.println(shortestPath(graph,0,4));
    }
}