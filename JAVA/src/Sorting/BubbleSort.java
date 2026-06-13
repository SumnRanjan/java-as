package Sorting;

public class BubbleSort {
    public static void bubbleSort(int [] arr){
        for(int turn = 1 ; turn < arr.length ; turn++){
            for(int i = 0 ; i < arr.length - turn ; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {3 ,-7, 4 , 5 , 9 , 2};
        bubbleSort(arr);
        for(int ar : arr){
            System.out.print(ar + " ");
        }
    }
}
