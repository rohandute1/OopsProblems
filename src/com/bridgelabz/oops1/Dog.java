package com.bridgelabz.oops1;

public class Dog {
    String breed;
    int age;
    double weight;
    Dog(String breed,int age,double weight){
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    public int dogAgeInHumanYears(){
        if (age<=2){
            return age * 11;
        }else{
            return (2*11)+(age-2)*5;
        }
    }
    public void dogDetails(){
        System.out.println("Dog breed is : " + breed);
        System.out.println("Dog age in human years is : " + dogAgeInHumanYears());
        System.out.println("Dog weight is : " + weight);
    }
    public static void main(String[] args){
        Dog dog = new Dog("Golden Retriever",5,17.700);
        dog.dogDetails();
    }
}
