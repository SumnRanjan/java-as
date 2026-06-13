package SlidingWindow;

public class SubArraySum {
    public static int SubArraySumLess(int[] arr, int k, int maxSum) {
        int count = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum <= maxSum) count++;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (sum <= maxSum) count++;
        }
        return count;
    }

    public static int SubArraySumLess2(int [] arr , int k , int maxSum){
        int n = arr.length;
        int l = 0, r = 0, count = 0, sum = 0;
        while (r < n) {
            sum += arr[r];
            if (r - l + 1 == k) {
                if (sum <= maxSum) {
                    count++;
                }
                sum -= arr[l];
                l++;
            }
            r++;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {2 , 3 , 14 , 7 , 11 , 13 , 18 , 16};
        int k = 3;
        int maxSum = 32;

        System.out.println(SubArraySumLess(arr , k , maxSum));
        System.out.println(SubArraySumLess2(arr , k , maxSum));
    }
}
