package BackTracking;

public class CoinChange {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5 , 8};
//        solve(arr , 10 , 0 , "");
        solve2(arr , 10 , 0 , "" , 0);
    }


    public static void solve(int [] arr , int target , int curr , String ans){
        if(curr == target){
            System.out.println(ans);
            return ;
        }
        if(curr > target){
            return;
        }
        for (int ar : arr) {
            solve(arr, target, curr + ar, ans + ar + " ");
        }
    }

    public static void solve2(int [] arr , int target , int curr , String ans , int currIdx){
        if(curr == target){
            System.out.println(ans);
            return ;
        }
        if(curr > target){
            return;
        }
        for (int i = currIdx; i < arr.length; i++) {
            solve2(arr, target, curr + arr[i], ans + arr[i] + " " , i);
        }
    }
}
