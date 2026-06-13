package Pattern;

import java.util.Scanner;
// Mirroring
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = n;
        for(int i = 0 ; i  < n ; i++){
            for(int j = 0 ; j < start; j++){
                System.out.print("* ");
            }
            start--;
            System.out.println();
        }
    }
}
