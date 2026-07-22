package main.java.DSA.Scenerio_Based.RecursionandBacktracking;


import java.util.*;

public class ChessPuzzleGenerator {

    // ------------------- N Queens -------------------

    public void solveNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        solve(board, 0);
    }

    private void solve(char[][] board, int row) {

        if (row == board.length) {

            printBoard(board);
            System.out.println();

            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                solve(board, row + 1);

                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col) {

        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--)
            if (board[i][j] == 'Q')
                return false;

        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    private void printBoard(char[][] board) {

        for (char[] row : board) {

            for (char ch : row)
                System.out.print(ch + " ");

            System.out.println();
        }
    }

    // ---------------- Permutations ----------------

    public void permutations(String str) {

        permute("", str);
    }

    private void permute(String ans, String str) {

        if (str.length() == 0) {

            System.out.println(ans);

            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String left = str.substring(0, i);

            String right = str.substring(i + 1);

            permute(ans + ch, left + right);
        }
    }

    // ---------------- Subsets ----------------

    public void subsets(int arr[]) {

        generateSubset(arr, 0, new ArrayList<>());
    }

    private void generateSubset(int arr[],
                                int index,
                                ArrayList<Integer> list) {

        if (index == arr.length) {

            System.out.println(list);

            return;
        }

        list.add(arr[index]);

        generateSubset(arr, index + 1, list);

        list.remove(list.size() - 1);

        generateSubset(arr, index + 1, list);
    }

    // ---------------- Combination Sum ----------------

    public void combinationSum(int arr[],
                               int target) {

        findCombination(arr,
                target,
                0,
                new ArrayList<>());
    }

    private void findCombination(int arr[],
                                 int target,
                                 int index,
                                 ArrayList<Integer> list) {

        if (target == 0) {

            System.out.println(list);

            return;
        }

        if (index == arr.length || target < 0)
            return;

        list.add(arr[index]);

        findCombination(arr,
                target - arr[index],
                index,
                list);

        list.remove(list.size() - 1);

        findCombination(arr,
                target,
                index + 1,
                list);
    }

    // ---------------- Main ----------------

    public static void main(String[] args) {

        ChessPuzzleGenerator obj =
                new ChessPuzzleGenerator();

        System.out.println("===== N Queens =====");

        obj.solveNQueens(4);

        System.out.println("===== Permutations =====");

        obj.permutations("ABC");

        System.out.println();

        System.out.println("===== Subsets =====");

        int arr[] = {1, 2, 3};

        obj.subsets(arr);

        System.out.println();

        System.out.println("===== Combination Sum =====");

        int nums[] = {2, 3, 6, 7};

        obj.combinationSum(nums, 7);
    }
}