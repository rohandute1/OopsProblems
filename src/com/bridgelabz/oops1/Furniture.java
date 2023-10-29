package com.bridgelabz.oops1;

public class Furniture {
    String type;
    String material;
    double price;
    public double calculateDiscountPrice() {
        double woodChair = 2200.0;
        double plasticChair = 800.0;
        if(material.equals("Wood"))
        {
            return woodChair - (woodChair*((double) 5 /100));
        }
        else if(material.equals("Plastic"))
        {
            return plasticChair - (plasticChair*((double) 10 /100));
        }
        else
        {
            return 0.00;
        }
    }
    public void printFurnitureDetails(){
        System.out.println("Type of furniture is : "+ type);
        System.out.println("Material used in furniture is : "+ material);
        System.out.println("Price of furniture is : "+ price);
        System.out.println("Discounted price of Wooden chair is : "+ calculateDiscountPrice());
    }
    public static void main(String[] args){
        Furniture furniture = new Furniture();
        furniture.type = "Wooden Chair";
        furniture.price = 800;
        furniture.material = "Plastic";
        System.out.println("Furniture details are : ");
        furniture.printFurnitureDetails();

    }
}
