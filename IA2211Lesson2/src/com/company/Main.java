package com.company;

public class Main {

    static String name  = "Janith";
    public static final int serialNum = 10;
    boolean isActive = false;


    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Name:" + name);
        //serialNum = 12; (Cannot assign a value to final variable)

        String myName = "Tharindu" + " " + "Janith";
        System.out.println(myName);

        int valA = 10;
        double valB = (double) valA;
        int valC = valA / (int) 2.5;
        System.out.println("valC =" + valC);

        /* Example for Multi line comment
        int valC = valA / (int) 2.5;
        System.out.println("valC =" + valC);
        */

        //Codes in pdf Lesson 02
        int valueA = 20, valueB = 30, valueC = 40;
        int sumInt = valueA + valueB + valueC;
        double sumDouble = (double) valueA + (double) valueB + (double) valueC;

        System.out.println("Sum Int = " + sumInt);
        System.out.println("Sum Double = " + sumDouble);

        double div = 3.5;
        int avgInt = sumInt / (int) div;
        double avgIntDouble = sumInt / div;
        double avgDouble = sumInt/ div;
        float a = (float) 2.5;

        System.out.println("avgInt = " + avgInt);
        System.out.println("avgIntDouble = " + avgIntDouble);
        System.out.println("avgDouble = " + avgDouble)++;




    }
}