package main.java.DSA.gcr_codebase.Recursion_Backtracking;


import java.util.*;

public class FeatureFlagCombinations {

    public static List<List<String>> generateCombinations(String[] flags) {

        List<List<String>> result = new ArrayList<>();

        backtrack(flags, 0, new ArrayList<>(), result);

        return result;
    }

    private static void backtrack(String[] flags,
                                  int index,
                                  List<String> current,
                                  List<List<String>> result) {

        if (index == flags.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include
        current.add(flags[index]);
        backtrack(flags, index + 1, current, result);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude
        backtrack(flags, index + 1, current, result);
    }

    public static void main(String[] args) {

        String[] flags = {"DarkMode", "Checkout", "Search"};

        List<List<String>> ans = generateCombinations(flags);

        for (List<String> list : ans)
            System.out.println(list);
    }
}