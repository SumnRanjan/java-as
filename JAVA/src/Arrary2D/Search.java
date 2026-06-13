package Arrary2D;

import java.util.Scanner;

public class Search {
    public static boolean SearchArr(int [][]arr , int target){
        int r = 0;
        int c = arr[0].length - 1;

        while (r < arr.length && c >= 0){
            if(arr[r][c] == target){
                return true;
            } else if (arr[r][c] > target) {
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];

        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(SearchArr(arr , 10));
    }
}
