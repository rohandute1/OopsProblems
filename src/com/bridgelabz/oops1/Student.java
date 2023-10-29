package com.bridgelabz.oops1;

public class Student {
    String name;
    int age;
    int id;
    Student(String name, int age,int id)
    {
        this.age=age;
        this.id=id;
        this.name=name;
    }
    public static void main(String[] args){
        Student s = new Student("Rohan",24,42);
        System.out.println("student details are: "+s.name+" "+s.id);
    }
}
