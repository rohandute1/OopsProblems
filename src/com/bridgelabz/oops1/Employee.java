package com.bridgelabz.oops1;

public class Employee{
    String name;
    double salary;
    int id;
    Employee(String name,double salary,int id){
        this.salary = salary;
        this.name = name;
        this.id = id;
    }
    public double calculateSalary(){
        return salary * 12;
    }
    public void printNameAndSalary(){
        System.out.println("Print employee Name : " + name);
        System.out.println("Print employee salary : " + calculateSalary());
    }
    public static void main(String[] args){
        Employee emp = new Employee("Rohan",40000,13);
        emp.printNameAndSalary();
    }
}