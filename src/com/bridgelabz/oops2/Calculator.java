package com.bridgelabz.oops2;

import java.util.Scanner;

public class Calculator {
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 numbers to do addition.");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = add(x,y);
        System.out.println("The addition of two numbers : "+ result);
    }
    public int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args){
        Calculator cal = new Calculator();
        cal.input();
    }
}
