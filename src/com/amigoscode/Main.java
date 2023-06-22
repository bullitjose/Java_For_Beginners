package com.amigoscode;

import java.awt.Color;
import java.awt.Point;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.BrokenBarrierException;

public class Main {
    /*Method construct:
    -Acces Modifier
    -Optional static
    -Return type
    -Name
    -Optional Parameters
    -Method Body
    -Optional return value
     */
    public static void main(String[] args)
    {
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
        System.out.println("   a  ".trim());//a

        //Arrays
        int[] numbers=new int[3];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        System.out.println(Arrays.toString(numbers));//imprimir array [1,2,3]
        System.out.println(numbers.length);//3
        int[] numbers2={4,5,6,7,8};
        System.out.println(numbers2.length);//5
        numbers2[1]=55;

        //default values for primitives is 0
        int[] numbers3=new int[4];
        System.out.println(Arrays.toString(numbers3));//[0,0,0,0]

        //we can define de default value in array
        int[] numbers4=new int[4];
        Arrays.fill(numbers4, -1);
        System.out.println(Arrays.toString(numbers4));//[-1,-1,-1,-1]

        //default value in array for reference types
        String[] str1=new String[4];
        System.out.println(Arrays.toString(str1));//[null, null, null, null]
        Arrays.fill(str1, "foo");
        System.out.println(Arrays.toString(str1));//[foo, foo, foo, foo]

        //Loops
        for (int i=0;i<=10;i++){
            System.out.println("hello "+i);

        }
        //Loops an Array, str1
        for (String paraula:str1){
            System.out.println(paraula);
        }

        //If statemetns
        if(false){
            System.out.println("this code don`t run");
        }else{
            System.out.println("this code runs when is true");
        }

        //If statemetns with conditions
        int age=15;
        boolean isAdult=age>=16;
        if(isAdult){
            System.out.println(" is adult");
        }else if (age==2){
            System.out.println("baby ");
        }else if (age==3){
            System.out.println("toddler");
        }else{
            System.out.println(" is not an adult :");
        }

        //! on ifs , lesson 58
        System.out.println(!true);
        System.out.println(!false);

        //Switch statement, lesson 60
        char grade = 'B';
        switch (grade){
            case 'A': System.out.println("Excellent");
            break;
            case'B':
                System.out.println("Pass");
                break;
            case 'C':System.out.println("Fail");
            break;
            default:
                System.out.println("Foo");}

        //New Switch Expression, lesson 62
        String result =switch(grade){
            case 'A'->"Excellent";
            case 'B','C'-> "Pass";
            default ->"Fail";
        };
        System.out.println(result);

        //Packages, lesson 63
        Point point= new Point();
        Color color=new Color(0x9C8888);

        //Import with fully qualified name, lesson 68
        Date date=new Date();
        java.sql.Date date1=new java.sql.Date(1); //From different package

        //No Import for java lang package, its de default packages
        String name="AmigosCode";
        Math.cos(2.34);

        //Access Modifiers Intro, lesson 70
        //Access level
        //classes, methods, attributes & constructors
        //default, public, private & protected


        System.out.println(foo);
        //System.out.println(brand1);//error!!
        Main m=new Main();
        System.out.println(m.brand1);


    }
    static String foo="bar";
    String brand1="amigosCode";




}