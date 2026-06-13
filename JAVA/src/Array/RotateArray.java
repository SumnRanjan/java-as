package Array;

public class RotateArray {
    public  static  void rotate(int [] arr , int k){
        int n = arr.length;
        k = k % n;

        while (k > 0){
            int temp = arr[n-1];
            for (int i = n - 2 ; i >=0 ; i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
            k--;
        }
    }

    public static void rev(int [] arr , int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void optimiseRotate(int [] arr , int k){
        int n = arr.length;
        k = k % n;
        rev(arr , n - k  , n - 1);
        rev(arr , 0 , n - k - 1);
        rev(arr , 0 , n - 1);

    }


    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4, 5 , 6};
//        rotate(arr , 2);
        optimiseRotate(arr , 15);
        for(int ar : arr){
            System.out.print(ar + " ");
        }
    }
}
