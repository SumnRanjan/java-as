package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {5 , 2 , 3 , 9 , 4 , 5 , 7};
        quickSort(arr , 0 , arr.length - 1);
        for(int ar : arr){
            System.out.print(ar + " ");
        }
    }

    public static void quickSort(int [] arr , int start , int end){
        if(start >= end){
            return;
        }
        int pos = partition(arr , start , end);
        quickSort(arr , start , pos - 1);
        quickSort(arr , pos + 1 , end);
    }

    public static int partition(int [] arr  , int start , int end){
        int item = arr[end];
        int pos = start;
        for(int i = start; i < end; i++){
            if(arr[i] < item){
                int temp = arr[pos];
                arr[pos++] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[end];
        arr[end] = arr[pos];
        arr[pos] = temp;
        return pos;
    }
}