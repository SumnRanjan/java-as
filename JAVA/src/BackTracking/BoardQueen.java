package BackTracking;

public class BoardQueen {
    public static void main(String[] args) {
        boolean [] board = new boolean[4];
//        solveBoard(board , 2 , 0 , "");
        solveBoard1(board , 2 , 0 , "" , 0);
    }

    public static void solveBoard(boolean [] board , int tq , int qpsf , String ans){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if(!board[i]){
                board[i] = true;
                solveBoard(board , tq , qpsf + 1 , ans+ "b"+ i+ "q" +qpsf+" ");
                board[i] = false; //backtrack
            }
        }
    }

    public static void solveBoard1(boolean [] board , int tq , int qpsf , String ans , int curr){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }

        for (int i = curr; i < board.length; i++) {
            if(!board[i]){
                board[i] = true;
                solveBoard1(board , tq , qpsf + 1 , ans+ "b"+ i+ "q" +qpsf+" " , curr+1);
                board[i] = false; //backtrack
            }
        }
    }
}
