package com.bridgelabz.oops1;

public class Circle {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public void areaCalculator(){
        double areaOfCircle=  3.14 * radius * radius;
        System.out.println("Area of circle :" + areaOfCircle);
    }
    public void circumferenceCalculator(){
        double circumferenceOfCircle =  2 * 3.14 * radius;
        System.out.println("Circumference of circle :" + circumferenceOfCircle);
    }
    public static void main(String[] args){
        Circle circle = new Circle(12);
        circle.areaCalculator();
        circle.circumferenceCalculator();
    }
}
