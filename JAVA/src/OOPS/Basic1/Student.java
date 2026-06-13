package OOPS.Basic1;

import java.lang.Exception;

public class Student {

    private String name = "Suman";
    private int age = 16;

    public Student(){
        System.out.println("Hello");
    }

    public Student(Student obj){
        this.name = obj.name;
        this.age = obj.age;
    }
    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age < 0){
            throw new Exception("Age can't be negative");
        }
        this.age = age;
    }
}
