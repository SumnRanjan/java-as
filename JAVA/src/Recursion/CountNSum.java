package Recursion;

public class CountNSum {
    public static int solve(int n , int sum){
        if(sum == n){
            return 1;
        }

        if(sum > n){
            return  0;
        }

        return solve(n , sum + 1) + solve(n , sum + 2);
    }

    public static void main(String[] args) {
        int count = solve(4 , 0 );
        System.out.println(count);
    }
}
