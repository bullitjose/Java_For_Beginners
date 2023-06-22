package com.amigoscode;

import java.util.Arrays;

public class MainLesson84 {
    public static void main(String[] args){
     //Call terminal java and run: $ com.amigoscode.MainLesson84 hello ciao
     //Arguments:

       if(args.length>0){
           System.out.println("Arguments: ");
           System.out.println(Arrays.toString(args));

       }else {
           System.out.println("0 arguments: ");
       }


    }

}
