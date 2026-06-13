package Arrary2D;

import java.util.Scanner;

public class WavePrint {
    public static void wavePrint(int [][] arr){
        for (int col = 0; col < arr.length; col++) {
            if(col % 2 == 0){
                for (int row = 0; row < arr.length; row++) {
                    System.out.println(arr[col][row] + " ");
                }
            }
            else{
                for (int row = arr.length - 1; row >= 0 ; row--) {
                    System.out.println(arr[col][row]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];

        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        wavePrint(arr);


    }
}
