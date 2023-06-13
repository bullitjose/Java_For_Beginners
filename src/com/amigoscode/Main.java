package com.amigoscode;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello java ");
        double amount=1_000_000_008.4;
        double amount1=1.0000000084E9;
        System.out.println(amount+" "+amount1);
        //BODMAS
        /*The BODMAS acronym is for:

        Brackets (parts of a calculation inside brackets always come first).
                Orders (numbers involving powers or square roots).
                Division.
                Multiplication.
                Addition.
                Subtraction.
                */

        int number=0;
        System.out.println("Return value of number an increment 1 "+ number++);//0
        System.out.println("Increment number 1, and then return value of number "+ ++number);//2


        //Short hand re assigment
        /*
        x+=y is x=x+y
        x-=y is x=x-y
        x*=y is x=x*y
        x/=y is x=x/y
         */
        int numberOne =2;
        int numberTwo=10;
        numberTwo +=2;

        System.out.println(numberTwo);//12

        numberTwo +=numberOne;
        System.out.println(numberTwo);//14

        numberTwo *=2;
        System.out.println(numberTwo);//28

        //Strings
        String brand ="Amigoscode";
        System.out.println(brand+" ");
        System.out.println(brand.toLowerCase());//amigoscode
        System.out.println(brand.toUpperCase());//AMIGOSCODE
        System.out.println(brand.substring(0,6));//Amigos
        System.out.println("   a  ".trim);//a


    }
}