package Function;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fun();
//        fun1();
        int ans = fun2(10 ,30);
        System.out.println(ans);
    }

    public static void fun(){
        System.out.println("Hello");
    }

    public static void fun1(){
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    public static int fun2(int a , int b){
        return a + b;
    }
}
