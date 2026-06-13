package OOPS.Inheitance;

public class Child extends Parent{
    int c = 30;
    int d = 40;

    @Override
    public void fun(){
        System.out.println("Hello fun in child");
    }
    public void fun1(){
        System.out.println("Hello fun1 in child");
    }
}
