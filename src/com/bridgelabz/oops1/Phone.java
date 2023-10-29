package com.bridgelabz.oops1;

public class Phone {
    String make;
    String model;
    int storage;
    Phone(String make,String model,int storage){
        this.make = make;
        this.model = model;
        this.storage = storage;
    }
    public double calculatePrice(){
        double basePrice = 10;
        double phoneMaker = 0;
        double phoneModel = 0;
        double phoneStorage = 0;

        if (make.equals("Apple")){
            phoneMaker = 16;
        }else if(make.equals("Samsung")){
            phoneMaker = 12;
        }
        if (model.equals("10X")){
            phoneModel = 20;
        }else if(make.equals("S10")){
            phoneModel = 15;
        }
        if (storage==64){
            phoneStorage = 11;
        }else if(storage==128){
            phoneStorage = 13;
        }else if(storage==256){
            phoneStorage = 15;
        }else if(storage==526){
            phoneStorage = 18;
        }
        return basePrice * phoneMaker * phoneModel * phoneStorage;
    }
    public void phoneDetails(){
        System.out.println("Company of phone is : " + make);
        System.out.println("Phone model is : " + model);
        System.out.println("Phone storage is : " + storage);
    }
    public static void main(String[] args){
        Phone phone = new Phone("Apple","10X",64);
        phone.phoneDetails();
        double price = phone.calculatePrice();
        System.out.println("Price of phone is : "+ price);

    }
}
