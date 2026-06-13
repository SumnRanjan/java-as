package Array;

public class KadaneAlgo {
    public static int maxSum(int [] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int ar : arr) {
            sum += ar;
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {1 , 2 , -8 , 7 , 6};
        System.out.println(maxSum(arr));
    }
}
