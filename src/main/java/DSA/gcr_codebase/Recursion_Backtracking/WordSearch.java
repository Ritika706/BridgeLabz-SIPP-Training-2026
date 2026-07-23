package main.java.DSA.gcr_codebase.Recursion_Backtracking;


public class WordSearch {

    public static boolean exist(char[][] board,
                                String word){

        int rows=board.length;

        int cols=board[0].length;

        boolean[][] visited=
                new boolean[rows][cols];

        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){

                if(dfs(board,
                        word,
                        0,
                        i,
                        j,
                        visited))

                    return true;
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board,
                               String word,
                               int index,
                               int row,
                               int col,
                               boolean[][] visited){

        if(index==word.length())
            return true;

        if(row<0 || row>=board.length ||
                col<0 || col>=board[0].length)
            return false;

        if(visited[row][col] ||
                board[row][col]!=word.charAt(index))
            return false;

        visited[row][col]=true;

        boolean found=

                dfs(board,word,index+1,row+1,col,visited) ||

                        dfs(board,word,index+1,row-1,col,visited) ||

                        dfs(board,word,index+1,row,col+1,visited) ||

                        dfs(board,word,index+1,row,col-1,visited);

        visited[row][col]=false;

        return found;
    }

    public static void main(String[] args){

        char[][] board={

                {'A','B','C','E'},

                {'S','F','C','S'},

                {'A','D','E','E'}
        };

        System.out.println(exist(board,"ABCCED"));

        System.out.println(exist(board,"SEE"));

        System.out.println(exist(board,"ABCB"));
    }
}