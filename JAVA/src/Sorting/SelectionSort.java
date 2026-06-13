package Sorting;

public class SelectionSort {
    public static void selectionSort(int [] arr){
        for(int i = 0 ;  i < arr.length ; i++){
            int mini = i;
            for(int  j = i + 1 ; j < arr.length ; j++){
                if(arr[mini] > arr[j]){
                    mini = j;
                }
            }

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;  
        }
    }
    public static void main(String[] args) {
        int [] arr = {1 , 3 , -7  , 6 , 9};
        selectionSort(arr);
        for(int ar : arr){
            System.out.print(ar + " ");
        }
    }
}
