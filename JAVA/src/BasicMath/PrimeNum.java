package BasicMath;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        if (n < 2) {
            System.out.println("Not Prime");
            return;
        }
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}
