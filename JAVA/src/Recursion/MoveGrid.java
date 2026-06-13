package Recursion;

public class MoveGrid {
    public static void main(String[] args) {
        int [][] arr = new int[5][4];
        path(arr , "" , 0 , 0);
    }

    public static void path(int [][] arr, String ans , int row , int col){
        if(row >= arr.length || col >= arr[0].length) {
            return;
        }

        if(row == arr.length - 1 && col == arr[0].length - 1){
            System.out.println(ans);
            return;
        }

        path(arr , ans + 'H' , row  , col +1);
        path(arr , ans + 'V' , row + 1 , col);
    }

}
