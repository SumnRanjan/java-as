package Array;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int [] arr = {1 , 2 , -8 , 7 , 6};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+= arr[j];
                max = Math.max(sum , max);
            }

        }
        return max;
    }
}
