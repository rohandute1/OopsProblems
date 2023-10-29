package com.bridgelabz.oops1;

public class Computer {
    String processor;
    int ram ;
    int storage;
    public void calculatePrice(){
        double basePrice = 10;
        double compProcessor = 0;
        double compRAM = 0;
        double compStorage = 0;

        if (processor.equals("i7")){
            compProcessor = 16;

        }else if(processor.equals("i9")){
            compProcessor = 12;
        }
        if (ram == 8){
            compRAM = 20;
        }else if(ram == 16){
            compRAM = 15;
        }
        if (storage==256){
            compStorage = 11;
        }else if(storage==512){
            compStorage = 13;
        }
        System.out.println("Price of Computer is : " + basePrice*compProcessor*compRAM*compStorage);
    }
    public void phoneDetails(){
        System.out.println("Processor of computer is : " + processor);
        System.out.println("RAM of computer is : " + ram);
        System.out.println("Storage of Computer is : " + storage);
    }
    public static void main(String[] args){
        Computer comp = new Computer();
        comp.processor = "i7";
        comp.ram = 16;
        comp.storage = 512;
        comp.phoneDetails();
        System.out.println("Price of Computer is : ");
        comp.calculatePrice();
    }
}
