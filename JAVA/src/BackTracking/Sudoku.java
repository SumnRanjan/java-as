package BackTracking;

public class Sudoku {
    public static void main(String[] args) {
        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };
        
        solveSudoku(board , 0 , 0);
    }

    public static void solveSudoku(int [][] board  , int row , int col){
        if(col == 9){
            row++;
            col = 0;
        }

        if(row == 9){
            display(board);
            return;
        }

        if(board[row][col] != 0){
            solveSudoku(board , row , col+1);
        }else{
            for (int i = 1; i <= 9 ; i++) {
                if(isSafe(board , row , col , i)){
                    board[row][col] = i;
                    solveSudoku(board , row , col+1);
                    board[row][col] = 0;
                }
            }
        }
    }

    public static boolean isSafe(int [][] board, int row , int col , int num){
        for (int i = 0; i < 9; i++) {
            if(board[i][col] == num || board[row][i] == num){
                return false;
            }
        }

        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r+3 ; i++) {
            for (int j = c; j < c+3 ; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int [][] board){
        for (int[] num : board) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }
    }
}
