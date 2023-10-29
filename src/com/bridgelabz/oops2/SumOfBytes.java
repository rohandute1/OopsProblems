package com.bridgelabz.oops2;

import java.util.Scanner;

public class SumOfBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first byte value:");
        byte byte1 = scanner.nextByte();

        System.out.println("Enter the second byte value:");
        byte byte2 = scanner.nextByte();

        int sum = (int) byte1 + (int) byte2;

        System.out.println("Sum of the two byte values: " + sum);
    }
}
