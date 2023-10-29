package com.bridgelabz.oops1;

public class Shirt {
    int size;
    String color;
    int price;
    public double discountCalculator(){
        double size28Price = 300;
        double size30Price = 350;
        double size32Price = 400;
        double size26Price = 250;
        if(size == 26) {
            return size26Price - size26Price * ((double) 15 / 100);
        }
        else if(size == 28){
            return size28Price - size28Price * ((double) 20 / 100);
        }
        else if(size == 30){
            return size30Price - size30Price * ((double) 25 / 100);
        }
        else if(size == 32){
            return size32Price - size32Price * ((double) 30 / 100);
        }
        else{
            return 0.00;
        }
    }
    public void printShirtDetails(){
        System.out.println("Shirt color is :" + color);
        System.out.println("Shirt size is : " + size);
        System.out.println("Discount on shirt is Rs " + discountCalculator());
    }
    public static void main(String[] args){
        Shirt shirt = new Shirt();
        shirt.color = "blue";
        shirt.size = 30;
        shirt.printShirtDetails();
    }
}
