package OOPS.Basic1;

public class Demo {
    public static void main(String[] args) {
        DemoClient obj1 = new DemoClient();
        DemoClient obj2 = new DemoClient();
        DemoClient.b =2;

        System.out.println(obj1.a);
        System.out.println(DemoClient.b);

    }
}
