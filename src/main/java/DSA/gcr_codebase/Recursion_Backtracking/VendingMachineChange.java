package main.java.DSA.gcr_codebase.Recursion_Backtracking;

import java.util.*;

public class VendingMachineChange {

    public static List<List<Integer>> makeChange(int[] coins,
                                                 int target) {

        Arrays.sort(coins);

        List<List<Integer>> result = new ArrayList<>();

        backtrack(coins,
                target,
                0,
                new ArrayList<>(),
                result);

        return result;
    }

    private static void backtrack(int[] coins,
                                  int target,
                                  int start,
                                  List<Integer> path,
                                  List<List<Integer>> result) {

        if (target == 0) {

            result.add(new ArrayList<>(path));

            return;
        }

        for (int i = start; i < coins.length; i++) {

            if (coins[i] > target)
                break;

            path.add(coins[i]);

            backtrack(coins,
                    target - coins[i],
                    i,
                    path,
                    result);

            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] coins = {2,3,6,7};

        System.out.println(makeChange(coins,7));
    }
}