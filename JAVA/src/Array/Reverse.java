package Array;

public class Reverse {
    public static void rev(int [] arr , int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4, 5 , 6 , 7 , 8 , 9 , 10};

        rev(arr , 2 , 7);
        for(int ar : arr){
            System.out.print(ar + " ");
        }
    }
}
