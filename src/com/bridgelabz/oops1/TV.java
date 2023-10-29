package com.bridgelabz.oops1;

public class TV {
    String brand;
    int size;
    double price;
    public double calculateDiscountPrice() {
        double tv32Inch = 28000.0;
        double tv40Inch = 35000.0;
        double tv48Inch = 42000.0;
        double tv55Inch = 49000.0;
        if(size == 32)
        {
            return tv32Inch - (tv32Inch*((double) 8 /100));
        }
        else if(size == 40)
        {
            return tv40Inch - (tv32Inch*((double) 10 /100));
        }
        else if (size == 48)
        {
            return tv48Inch - (tv48Inch*((double) 12 /100));
        }
        else if (size == 55)
        {
            return tv55Inch - (tv55Inch*((double) 15 /100));
        }
        else
        {
            return 0.00;
        }
    }
    public void printTVDetails(){
        System.out.println("Brand of TV is : "+ brand);
        System.out.println("Size of TV is : "+ size);
        System.out.println("Discounted price of TV is : "+ calculateDiscountPrice());
    }
    public static void main(String[] args){
        TV tv = new TV();
        tv.size=48;
        tv.brand = "LG";
        tv.price=48000;
        System.out.println("TV details are : ");
        tv.printTVDetails();
    }
}
