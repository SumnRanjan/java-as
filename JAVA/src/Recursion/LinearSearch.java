package Recursion;

public class LinearSearch {
    public static int linearSearch(int [] arr , int i , int target){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == target){
            return i;
        }

        return linearSearch(arr , i + 1 , target);
    }
    public static void main(String[] args) {
        int [] arr = {2 , 5 , 7 , 8 , 10};
        System.out.println(linearSearch(arr , 0 , 8));
    }
}
