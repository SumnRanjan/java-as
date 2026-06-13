package SlidingWindow;

public class numSubarrayProduct {
    public static int numSubarrayProductLessThanK(int [] arr , int k){
        if(k <= 1) return  0;
        int n = arr.length;
        int l = 0 , r = 0 , product = 1 , count = 0;

        while (r < n){
            product *= arr[r];
            while (product >= k){
                product /= arr[l];
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 4 , 3 , 5};
        int k = 10;
        System.out.println(numSubarrayProductLessThanK(arr , k));
    }
}
