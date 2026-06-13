package Sorting;

public class Partition {
    public static void main(String[] args) {
        int [] arr = {5 , 7 , 2 , 3 , 8 , 9 , 1 , 4};
        int ans = partition(arr , 0 , arr.length - 1);
        System.out.println(ans);
        for(int ar : arr){
            System.out.print(ar + " ");
        }
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
