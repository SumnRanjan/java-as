package Recursion;

public class NumberSeq {
    public static void main(String[] args) {
        printNum(6 , 2 , 4);
    }

    public static void printNum(int n , int ft , int st){
        if(n == 0){
            return;
        }

        System.out.print(ft + " ");
        printNum(n - 1, st , ft + st + 1);
        System.out.print(ft + " ");
    }
}
