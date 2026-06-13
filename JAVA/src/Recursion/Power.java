package Recursion;

public class Power {
    public static int powerNum(int n , int power){
        if(power == 0){
            return 1;
        }
        return powerNum(n , power - 1) * n;
    }
    public static void main(String[] args) {
        System.out.println(powerNum(2 , 5));
    }
}   
