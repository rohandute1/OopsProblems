package com.bridgelabz.oops2;

public class ArithmeticSum {
    public int findSum(int a, int b) {
        return a + b;
    }
    public int findSum(int a, int b, int c) {
        return a + b + c;
    }
    public int findSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        ArithmeticSum arithmetic = new ArithmeticSum();

        int sum2 = arithmetic.findSum(10, 20);
        int sum3 = arithmetic.findSum(10, 20, 30);
        int sum4 = arithmetic.findSum(10, 20, 30, 40);

        System.out.println("Sum of 2 numbers: " + sum2);
        System.out.println("Sum of 3 numbers: " + sum3);
        System.out.println("Sum of 4 numbers: " + sum4);
    }
}
