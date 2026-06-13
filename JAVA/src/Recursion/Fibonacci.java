package Recursion;

public class Fibonacci {
    public static int solve(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return solve(n-1) + solve(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(solve(7));
    }
}
