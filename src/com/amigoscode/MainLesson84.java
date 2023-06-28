package com.amigoscode;

import java.awt.*;
import java.util.Arrays;

public class MainLesson84 {
    //Final Keyword, lesson 90, good aproach to make a constant
    public static final String NAME3="Alex"; //NAME3 Uppercase!!

    //Enums, lesson 91
    enum Gender{
        MALE,
        FEMALE
    }

    enum TShirtSize{
        S,
        M,
        L,
        XL
    }

    private String brand="amigosCode";//belong to instace of Class, dont use var
    public static void main(String[] args){
        //enum, lesson 91
        System.out.println(TShirtSize.S);
        System.out.println(Gender.FEMALE);

        //call Enum class
        System.out.println(Month.JANUARY);
        System.out.println(Month.FEBRUARY);

        //enum methods, lesson 92
        System.out.println(Month.values());//error print: [Lcom.amigoscode.Month;@36baf30c,
        //print de direction of an anarray, so pass array to string
        System.out.println(Arrays.toString(Gender.values()));//correct: [MALE, FEMALE]

        for(Gender gender:Gender.values()){
            System.out.println(gender);

        }


     //Call terminal java and run: $ com.amigoscode.MainLesson84 hello ciao
     //Arguments:
        //lesson 85
       if(args.length>0){
           System.out.println("Arguments: ");
           System.out.println(Arrays.toString(args));

       }else {
           System.out.println("0 arguments: ");
       }


       //Lesson 86, Type inference with var keyword
        //only for local variables!!
       var name="Jamila";
       var names=new String[]{"Andre","Jamila","Ali","Jones","Matt"};
       var age=12;
       var isAdult=false;
       var balance=1_000_000.33;

//lesson 87 Break and Continue
        var numbers=new int[]{1,2,3,4,5};
        for(int number:numbers){
            if(number==3) {
                break;
            }
            System.out.println(number);
        }





        //Lesson 88 and 89
        for(String name1:names){
            if(name1.startsWith("A")){
                continue;//move to next iteration of names

                //break; //break completly de for iteration

                //lesson 89
                //return;// if the method is void (public static void main(String[] args){)
                        //return exit the method!!, in this case main

            }
            System.out.println(name1);
        }

        //Final Keyword, lesson 90
        final var name2="Alex";
        //name2="Jamila";  //error, cannot assign a value to final variable
        System.out.println(name2);

        final Point p=new Point();
        p.y=10; //no error, p is final, but Point.y defenition isn't final!!
        System.out.println(NAME3); //A CONSTANT!!

}

}
