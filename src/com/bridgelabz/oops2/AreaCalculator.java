package com.bridgelabz.oops2;


import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

class Triangle {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and breadth of the rectangle:");
        double rectLength = scanner.nextDouble();
        double rectBreadth = scanner.nextDouble();

        System.out.println("Enter base and height of the triangle:");
        double triBase = scanner.nextDouble();
        double triHeight = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(rectLength, rectBreadth);
        Triangle triangle = new Triangle(triBase, triHeight);

        double rectArea = calculateAreas(rectangle);
        double triArea = calculateAreas(triangle);

        System.out.println("Area of the rectangle: " + rectArea);
        System.out.println("Area of the triangle: " + triArea);

        scanner.close();
    }

    public static double calculateAreas(Object shape) {
        if (shape instanceof Rectangle rectangle) {
            return rectangle.calculateArea();
        } else if (shape instanceof Triangle triangle) {
            return triangle.calculateArea();
        } else {
            return 0.0;
        }
    }
}
