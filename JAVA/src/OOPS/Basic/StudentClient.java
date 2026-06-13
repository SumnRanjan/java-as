package OOPS.Basic;

public class StudentClient {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Hello");
        s1.name = "Raj";
        s1.age = 20;
        s1.sayHello();

//        s2.name = "Aryan";
//        s2.age = 22;
//        s2.sayHello();
//        s1.sayHello1("Raj");

        s2.sayHello1("Aryan");
    }
}
