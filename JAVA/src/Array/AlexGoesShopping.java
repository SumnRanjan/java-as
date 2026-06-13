package Array;

import java.util.Scanner;

public class AlexGoesShopping {
    public static void main(String[] args) {
        int [] arr = {100 , 200 , 400 , 100};
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int money = sc.nextInt();
            int k = sc.nextInt();
            alexShopping(arr , money , k);
        }
    }

    public static void alexShopping(int []arr , int money , int k ) {

        int count =0;

        for (int j : arr) {
            if (money % j == 0) {
                count++;
            }
        }

        if(count>=k) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


    }

}
