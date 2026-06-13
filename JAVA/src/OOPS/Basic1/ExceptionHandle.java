package OOPS.Basic1;

public class ExceptionHandle {
    public static void main(String[] args) {
        try {
            fun();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void fun() throws Exception {
        System.out.println("Hello, I am in fun");
        fun1();
    }

    public static void fun1() throws Exception {
        System.out.println("Hello, I am in fun1");
        try{
            fun2();
        }catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void fun2() throws Exception {
        System.out.println(5 / 0);
        System.out.println("Hello, I am in fun2");
    }
}
