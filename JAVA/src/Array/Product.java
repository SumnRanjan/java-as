package Array;

public class Product {
    public static int [] product(int [] arr){
        int n = arr.length;
        int [] left = new int[n];
        int [] right = new int[n];

        left[0] = 1;
        for(int i = 1 ; i < n ; i++){
            left[i] = left[i-1] * arr[i - 1];
        }

        right[n-1] = 1;
        for(int i = n - 2 ; i >= 0 ; i--){
            right[i] = right[i+1] * arr[i+1];
        }

        for(int i = 0 ; i < n ; i++){
            arr[i] = left[i] * right[i];
        }
        return  arr;
    }
    public static void main(String[] args) {

        int [] arr = {5 ,4 , 3 , 2};
        int [] ans = product(arr);
        for(int an : ans){
            System.out.print(an + " ");
        }
    }
}
