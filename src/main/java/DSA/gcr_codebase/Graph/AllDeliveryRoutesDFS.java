package main.java.DSA.gcr_codebase.Graph;


import java.util.*;

public class AllDeliveryRoutesDFS {

    static void dfs(Map<Integer,List<Integer>> graph,
                    int current,
                    int target,
                    List<Integer> path,
                    Set<Integer> visited,
                    List<List<Integer>> ans){

        path.add(current);
        visited.add(current);

        if(current==target){

            ans.add(new ArrayList<>(path));

        }else{

            for(int next:graph.getOrDefault(current,
                    Collections.emptyList())){

                if(!visited.contains(next)){

                    dfs(graph,next,target,path,
                            visited,ans);
                }
            }
        }

        path.remove(path.size()-1);
        visited.remove(current);
    }

    public static void main(String[] args){

        Map<Integer,List<Integer>> graph=
                new HashMap<>();

        graph.put(0,List.of(1,2));
        graph.put(1,List.of(3));
        graph.put(2,List.of(3));
        graph.put(3,List.of());

        List<List<Integer>> ans=new ArrayList<>();

        dfs(graph,0,3,
                new ArrayList<>(),
                new HashSet<>(),
                ans);

        System.out.println(ans);
    }
}