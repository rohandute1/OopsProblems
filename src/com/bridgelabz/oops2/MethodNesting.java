package com.bridgelabz.oops2;

import java.util.Scanner;

public class MethodNesting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter length, breadth and height of cuboid :");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();

        double volume = calculateVolume(length,breadth,height);
        System.out.println("Volume of cuboid is : "+ volume);

        double area = calculateArea(length,breadth,height);
        System.out.println("Area of cuboid is : "+ area);

        double perimeter = calculatePerimeter(length,breadth,height);
        System.out.println("Perimeter of cuboid is : "+ perimeter);
    }
    public static double calculateVolume(double length,double breadth,double height){
        return length * breadth * height;
    }
    public static double calculateArea(double length,double breadth,double height){
        return 2 * (length * breadth + breadth * height + height * length);
    }
    public static double calculatePerimeter(double length,double breadth,double height){
        return 4 * (length + breadth + height);
    }
}
