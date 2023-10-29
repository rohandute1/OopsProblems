package com.bridgelabz.oops2;

public class ObjectCounter {
    private static int objectCount = 0;

    public ObjectCounter() {
        objectCount++;
    }

    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
    public static int getObjectCount() {
        return objectCount;
    }
}
