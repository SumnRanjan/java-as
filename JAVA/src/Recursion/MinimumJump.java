package Recursion;

public class MinimumJump {
    public static int minimumJump(int n , int ans){
        int mini = Integer.MAX_VALUE;

        if(n == 0){
            return ans;
        }

        for(int i = 1 ; i <= 3 ; i++){
            if(n - i >= 0){
                mini = Math.min(mini , minimumJump(n - i , ans + 1));
            }
        }

        return  mini;
    }

    public static void main(String[] args) {
        int ans = 0;
        System.out.println(minimumJump(5 , ans));
    }
}
