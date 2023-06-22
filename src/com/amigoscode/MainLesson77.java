package com.amigoscode;

public class MainLesson77 {
    /*Method construct:
        -Acces Modifier
        -Optional static
        -Return type
        -Name of method
        -Optional Parameters
        -Method Body
        -Optional return value
         */
    private static int add(int n1, int n2){
        int result =n1+n2;
        return result;
    }

    private static void printBrand(){
        System.out.println("amigosCode");
    }
    private static void printBrand1(String brand){
        System.out.println(brand.toUpperCase());
    }
    public static void main(String[] args){
        //MainLesson77 main=new MainLesson77();//if add method isn't static
        //int result = main.add(10, 10);//if add method isn't static
        int result = add(10, 10);
        System.out.println(result);
        printBrand();
        printBrand1("pepe");

    }


}
