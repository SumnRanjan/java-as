package Sorting;

public class DNF {
    public static void sortColors(int[] arr) {
        int n = arr.length;
        int i = 0;
        int left = 0;
        int right = n - 1;

        while (i <= right) {
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
                i++;
            }else if(arr[i] == 2){
                int temp = arr[i];
                arr[i] = arr[right];
                arr[right] = temp;
                right--;
            }else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1 , 0 , 2 , 0 , 2 , 0  , 1 , 1};
        sortColors(arr);
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}
