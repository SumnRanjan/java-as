package OOPS.Basic1;

public class StudentClient {
    public static void main(String[] args) {
//        Student obj1 = new Student( "Suman" , 45);
//        Student obj2 = new Student( "Aryan" , 22);
//        obj2.setAge(23);
//        obj1.setName("Raj");
//        System.out.println(obj1.getName());
//        System.out.println(obj2.getAge());
//
//        Student obj3 = new Student(obj1);
//        System.out.println(obj3.getName());
//        System.out.println(obj3.getAge());

        Student obj1 = new Student("Suman" , 20);
        System.out.println(obj1.getName());
//        obj1.setAge(21);
        obj1.setName("Raj");
        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());
    }
}
