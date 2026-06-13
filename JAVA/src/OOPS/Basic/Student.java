package OOPS.Basic;

public class Student {
    String name;
    int age;

    public void sayHello(){
        System.out.println("Hello my name is " + name + " and my age is " + age );
    }

    public void sayHello1(String name){
        System.out.println("Hello my name is " + name  + " " + this);
    }
}
