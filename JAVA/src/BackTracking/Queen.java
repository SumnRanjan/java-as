package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queen {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solveNQueen(0, board, ans, n);

        for (List<String> solution : ans) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    public static void solveNQueen(int col, char[][] board, List<List<String>> res, int n){
        if(col == n){
            List<String> curr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                curr.add(new String(board[i]));
            }
            res.add(curr);
            return;
        }

        for(int row = 0 ; row < n ; row++){
            if(isSafe(row , col , board , n)){
                board[row][col] = 'Q';
                solveNQueen(col+1 , board , res , n);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(int row, int col, char[][] board, int n) {
        int dupRow = row;
        int dupCol = col;

        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }

        row = dupRow;
        col = dupCol;
        while (col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
        }

        col = dupCol;
        while (row < n && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
}
