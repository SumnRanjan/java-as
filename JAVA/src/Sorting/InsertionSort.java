package Sorting;

public class InsertionSort {
    public static void insertionSort(int [] arr){
        for(int i = 1 ; i < arr.length ; i++){
            int item = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > item){
                arr[j+1] = arr[j];
                j--;
            }

            j++;
            arr[j] = item;
        }
    }

    public static void main(String[] args) {
        int [] arr = {-5 , 20 , 4  ,2 , 3 , 4};
        insertionSort(arr);
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}
