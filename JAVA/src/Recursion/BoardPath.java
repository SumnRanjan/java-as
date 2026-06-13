package Recursion;

public class BoardPath {
    public static void boardPath(int n , int target , int cs , String ans){
        if(cs == target){
            System.out.println(ans);
            return;
        }

        if(cs > target){
            return;
        }

        for (int i = 1; i <= n; i++) {
            boardPath(n , target , cs+i , ans+i);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        boardPath(n ,  3, 0 , "");
    }
}
