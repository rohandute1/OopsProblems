package com.bridgelabz.oops2;

public class ShapesAreaCalculator {
    public double findArea(double side) {
        return side * side;
    }
    public double findArea(double length, double width) {
        return length * width;
    }
    public double findArea(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        } else {
            System.out.println("Invalid shape. Please specify 'true' for a circle.");
            return 0.0;
        }
    }

    public static void main(String[] args) {
        ShapesAreaCalculator calculator = new ShapesAreaCalculator();

        double squareArea = calculator.findArea(5.0);
        double rectangleArea = calculator.findArea(4.0, 6.0);
        double circleArea = calculator.findArea(3.0, true);

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
