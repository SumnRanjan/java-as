package OOPS.Basic1;

public class ExceptionHandleTry {
    public static void main(String[] args) {
        fun();
    }

    public static void fun() {
        try {
            int [] arr = new int[5];
            System.out.println(arr[6]);
            System.out.println(5/0);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception caught: ");
        }
        catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
            System.out.println("Array Index Out of Bounds Exception caught ");
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception caught: ");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
