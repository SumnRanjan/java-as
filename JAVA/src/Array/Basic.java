package Array;

public class Basic {
    public static void main(String[] args) {

        int [] arr = new int[5];
//        System.out.println();
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr[0] + " " + arr[1]);
//        swap(arr[0] , arr[0]);
        swap1(arr , 0 , 1);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void swap(int a  , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swap1(int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
