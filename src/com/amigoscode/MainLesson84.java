package com.amigoscode;

import java.util.Arrays;

public class MainLesson84 {

    private String brand="amigosCode";//belong to instace of Class, dont use var
    public static void main(String[] args){
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
                //continue;//move to next iteration of names

                //break; //break completly de for iteration

                //lesson 89
                return;// if the method is void (public static void main(String[] args){)
                        //return exit the method!!, in this case main

            }
            System.out.println(name1);
        }


}

}
