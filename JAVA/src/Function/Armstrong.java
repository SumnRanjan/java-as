package Function;
import java.util.Scanner;

public class Armstrong {
    public static int count(int n){
        int count = 0;
        while (n != 0){
            n /= 10;
            count++;
        }
        return count;
    }
    public static boolean ArmstrongNumber(int n){
        int digitCont = count(n);
        int temp = n;
        int sum = 0;

        while (temp != 0){
            int rem = temp % 10;
            sum +=  (int) Math.pow(rem , digitCont);
            temp /= 10;
        }
        return  sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans =  ArmstrongNumber(n);
        System.out.println(ans);
    }
}
