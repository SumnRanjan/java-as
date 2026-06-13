package OOPS.Basic1;

public class PersonClient {
    public static void main(String[] args) {
        Person obj1 = new Person();
        System.out.println(obj1.name);
//        System.out.println(obj1.age);

        Person obj2 = new Person();
        obj2.name = "Ram";
        System.out.println(obj2.name);
//        obj2.age = 18;
//        System.out.println(obj2.age);

        obj2.age();
    }
}
