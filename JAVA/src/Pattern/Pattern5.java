package Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;

        for(int i = 1 ; i <= 2 * n - 1 ; i++){
            for(int j = 1; j <= star ; j++){
                System.out.print("*");
            }

            System.out.println();

            if(i < n){
                star++;
            } else{
                star--;
            }
        }
    }
}
