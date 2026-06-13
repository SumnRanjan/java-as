package Arrary2D;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {

    public static void transpose(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[4][4];

        for(int i = 0 ; i < 4 ; i++){
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        transpose(arr);
        System.out.println(Arrays.deepToString(arr));

    }
}
