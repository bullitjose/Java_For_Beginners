# Java_For_Beginners
## Course from amigosCode

1st, locally, at our project directory:

**which git remote?**
```
git remote -v   
origin	https://github.com/amigoscode/java-functional-programming.git (fetch)
origin	https://github.com/amigoscode/java-functional-programming.git (push)
```
**remove origin!!**
```
git remote -v   
origin	https://github.com/amigoscode/java-functional-programming.git (fetch)
origin	https://github.com/amigoscode/java-functional-programming.git (push)
```
**add our new origin, to our github**
```
git remote add origin git@github.com:bullitjose/java-functional-programming.git
```
**add changes at local to origin, at github**
```
git push -u origin master

```
**download changes at github to local**
```
git pull origin master
```

> Numerics literals with underscore, for readability
```
int amount=1_000_000_000
```

>BODMAS
```
     
        /*The BODMAS acronym is for:

        Brackets (parts of a calculation inside brackets always come first).
                Orders (numbers involving powers or square roots).
                Division.
                Multiplication.
                Addition.
                Subtraction.
                */
```
>Increment and Decrement (++n, n++, --n, n-- )
```
int number=0;
        System.out.println("Return value of number an increment 1 "+ number++);//return 0
        System.out.println("Increment number 1, and then return value of number "+ ++number);//return 2
 ```
 

>Short and re assigment
```
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
```
   >Naming Names
   
   booleans
   ```
   boolean isAdult=true;
   boolean hasCat=true;
```

>Reference types

**Strings**
```
String brand ="Amigoscode";
        System.out.println(brand+" ");
        System.out.println(brand.toLowerCase());//amigoscode
        System.out.println(brand.toUpperCase());//AMIGOSCODE
        System.out.println(brand.substring(0,6));//Amigos
        System.out.println("   a  ".trim);//a
```
**String API Documentation** look detail of methods

>Arrays
```
//Arrays
import java.util.Arrays; 
---
       int[] numbers=new int[3];//initializing
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        System.out.println(Arrays.toString(numbers));//imprimir array [1,2,3]
        System.out.println(numbers.length);//3
        int[] numbers2={4,5,6,7,8};
        System.out.println(numbers2.length);//5
        numbers2[1]=55;

```
**defalult value for arrays with primitives values is 0**
```
 //default values for primitives is 0
        int[] numbers3=new int[4];
        System.out.println(Arrays.toString(numbers3));//[0,0,0,0]
//we can define de default value in array
        int[] numbers4=new int[4];
        Arrays.fill(numbers4, -1);
        System.out.println(Arrays.toString(numbers4));//[-1,-1,-1,-1]
```
**default value for reference types is null!!**
```
 //default value in array for reference types
        String[] str1=new String[4];
        System.out.println(Arrays.toString(str1));//[null, null, null, null]
        Arrays.fill(str1, "foo");
        System.out.println(Arrays.toString(str1));//[foo, foo, foo, foo]


```

>Loops an Array

```
//Loops an Array, str1
        for (String paraula:str1){
            System.out.println(paraula);
        }

```

>If Statements (evaluate to true or false)

```
//if Statemetns
        if(false){
            System.out.println("this code don`t run");
        }else{
            System.out.println("this code runs when is true");
        }

```
>If statements with conditions

```
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
```

> Dont do this with if statements

```
if(isAdult ==true){
}

```

>Switch satement (lesson 60)

> New Switch Expression, lesson 62

```
        String result =switch(grade){
            case 'A'->"Excellent";
            case 'B','C'-> "Pass";
            default ->"Fail";
        };
        System.out.println(result);
```

>Package
**Rules for Naming packages**
- prefix always written in all-lowercase , should be one of the top-level domain names: com, edu, gov, mil, net, edu, etx
- subsequent components of the package name vary according to an organization's internal naming, but might specify certain directory name components.

>Import with fully qualified name, lesson 68

```
        Date date=new Date(); 
        java.sql.Date date1=new java.sql.Date(1); //From different package
```

>No Import for java lang package, its de default packages, lesson69

```
        String name="AmigosCode";
        Math.cos(2.34);
```

>Access Modifiers Intro, lesson 70
        //Access level
        //classes, methods, attributes & constructors
        //default, public, private & protected

>Public Access Modifier 71

```
public class Main  {   //class!!
    private static String foo="bar";   //attribute!!,  accesible: Ex:Main.foo , Main.main;
    
    public static void main(String[] args){   //method!!
    
         String foo="bar"; //local Variable!!!!
    
    }

}

```

>Private Access Modifier, lesson72

```
public class Main  {   //class!!
    private static String foo="bar";   //attribute!!, Not  accesible: Ex:Main.foo error!!, Main.main;
    
    public static void main(String[] args){   //method!!
    
         String foo="bar"; //local Variable!!!!
    
    }

}

```

>Default or nothing, lesson 73, only accesible by same package

>When To Use Each Access Modifier, lesson 75
Public methods, free use 
Private, internals methods

>Static Keyword, lesson 76
Static means that belongs to the class itself!!!
Acces is, ClassName.nameOfMethod/Attribute

```
     Public class Main{
     
    static String foo="bar";
    String brand1="amigosCode";
    
        public static void main(String[] args){
                System.out.println(foo);
                //System.out.println(brand1); //error, out of method
                Main m=new Main(); //Instancia de classe Main!!!
                System.out.println(m.brand); //Llamar la propiedad no static!!!
           }


    }
    

```


>Methods (lesson 77)

```
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
    
    }
```

```
public class MainLesson77 {

      private int add(int n1, int n2){
              int result =n1+n2;
              return result;
          }
          
          public static void main(String[] args){
              MainLesson77 main=new MainLesson77();//if add method isn't static
              int result = main.add(10, 10);//if add method isn't static
              System.out.println(result);
      
          }
    }
    
```
if the method add is static:
```
public class MainLesson77 {

      private static int add(int n1, int n2){
              int result =n1+n2;
              return result;
          }
          
         public static void main(String[] args){
              //MainLesson77 main=new MainLesson77();//if add method isn't static
              //int result = main.add(10, 10);//if add method isn't static
              int result = add(10, 10);
              System.out.println(result);

           }
    }
```

>Parameters and Arguments, lesson 79

```
private static add(int n1, int n2){
}
```
**n1 and n2 Parameters, could be any type of object or variable type.**

When we call the method, **10 and 20 are the arguments**:
```
int result=add(10,20);

```

>Void Method, lesson 80

```
private static void printBrand(){
      s
}
```

>Methods, naming convention, lesson 81

Methods should be verbs, in mixed case with the first letter lowercase, with the first letter of each internal word capitalized:
run();
runFast();
getBackground();

>Understanding public static void main, lesson 84

Run in a terminal first :
Compile de file with the main:
```
 casa@casa/ ~/amigosCode/code/Java_For_Beginners/src javac MainLesson84.java

```

Run  class file:

```
 casa@casa/ ~/amigosCode/code/Java_For_Beginners/src $ java com.amigoscode.MainLesson84
0 arguments:

```
Now we can add arguments to the main:
```
  casa@casa/ ~/amigosCode/code/Java_For_Beginners/src $ java com.amigoscode.MainLesson84 hello ciao
Arguments: 
[hello, ciao]

```
Also we can pass arguments by intellij, on menut Run/Edit Configurations: select Application, and then "Program arguments"

>Type Inference with Var , lesson 86

With **var** java takes care which type of variable is:
```
//Lesson 86, Type inference with var keyword
        //only for local variables!!
       var name="Jamila";
       var names=new String[]{"Jamila","Alex"};
       var age=12;
       var isAdult=false;
       var balance=1_000_000.33;

```

**Only local variable**and Java 10 or greater.
**Don't at methods or as parametrer**

>Break Keyword and Loops, lesson 87

>Break continue, lesson 88

**Continue jump to next iteration of for**
**Break, break completely de for**

>Return Keyword and Void Methods

We use return to exit the method, if it haven't return parameter, is void:
```
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
```

>Final Keyword, lesson 90

Final for constants, bes approach:
```
//Final Keyword, lesson 90, good aproach to make a constant
    public static final String NAME3="Alex"; //NAME3 Uppercase!!

```

>Enums, lesson 91 (other form to define constants)

Also to define constants, at the same class of the main (outer of methods) or the better way create a new class at the same package and select enum class:
```
package com.amigoscode;

public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH
}
```

>Enums Methods, lesson 92

Method values(), If we have a enum, we can get all the values:

```
        //enum methods, lesson 92
        System.out.println(Month.values());//error print: [Lcom.amigoscode.Month;@36baf30c,
        //print de direction of an anarray, so pass array to string
        System.out.println(Arrays.toString(Gender.values()));//correct: [MALE, FEMALE]
        //loop over all the values
         for(Gender gender:Gender.values()){
            System.out.println(gender);

        }

```

>Implicit and Explicit Type Casting, lesson 93

```
//Lesson93, Type casting-convert on data type to another
        //Implicit type (widening) casting
        int balance1=100;
        double balanceInDouble=balance1;
        System.out.println(balance1);//100
        System.out.println(balanceInDouble);//100.0
        
          //Explicit Type(Narrowing) Casting
        System.out.println("Explicit Type(Narrowing) Casting");
        double remainingBalance=100.55;//100.55
        System.out.println(remainingBalance);
        int remainingBalanceInt=(int) remainingBalance;//100
        System.out.println(remainingBalanceInt);

```

>Global and Local Variables, lesson 94

```
public class MainLesson84 {
    //global variable, lesson 94
    private static final String BRAND="AmigosCode";
```

**Local variables scope only access within the function**
**If we have two variables we the same name, one Global other local, at the method the local is selected**

**Constants are declared :**
```
public static final double PI=3.14;
```

>Wrapper Classes, lesson 95

For each primitive type there is a wrapper class, byte-Byte, boolean-Boolean, char-Character, etc. Ther wrapper class let use the primitives as **objects**

```
//Lesson 95, wrapper classes
        //Lesson 95, wrapper classes
        //int age3 =20;
        Integer age3=20; //Now is a class, with a lot of
        // methods: byteValue(), compareTo(), etc
        Double price=206.33;
        var ageStr="55";
        int a =Integer.parseInt(ageStr);//Pass to int, with Integer.parseInt method
        System.out.println(a);
        System.out.println(Integer.min(-1,5));
        System.out.println(Double.min(1.2, -43_344_980.902));

```

>Working With Strings, lesson 96

```
//lesson 96, Strings
        String name4="jamila";
        System.out.println(name4.toUpperCase());//JAMILA    
        System.out.println("  ".isBlank());//true
        System.out.println("  ".isEmpty());//false, we have empty spaces
        System.out.println(" hello  ".trim());//hello, without empty spaces
        System.out.println(name4.startsWith("j"));//true
        System.out.println(name4.substring(1));//amila
        System.out.println(name4.substring(1, 4));//ami
```

>How Strings are stored in memory, lesson 97

The String name1,  its at memory stack, its a Reference with the content "jamila" at the String Pool, a special memory region where Strings are stored by JVM at the HEAP.
STACK o pila vs HEAP:
|Paràmetre|STACK(pila)|HEAP
|---|---|---|
|Tipus d'estructures de dades|Una pila és una estructura de dades lineal.|Heap és una estructura de dades jeràrquica.|
|Velocitat d'accés|	Accés d'alta velocitat|	Més lent en comparació amb la pila|
|Gestió de l'espai|	L'espai gestionat de manera eficient pel sistema operatiu, de manera que la memòria mai es fragmentarà.|	L'espai heap no s'utilitza de manera tan eficient. La memòria es pot fragmentar a mesura que primer s'assignen blocs de memòria i després s'alliberen.|
|Accés	|Només variables locals|	Permet accedir a variables globalment.|
|Límit de mida de l'espai|	El límit de la mida de la pila depèn del sistema operatiu.|	No té un límit específic de mida de memòria.
Canvia la mida	Les variables no es poden redimensionar	Les variables es poden redimensionar.|
|Assignació de memòria|	La memòria s'assigna en un bloc contigu.|	La memòria s'assigna en qualsevol ordre aleatori.|
|Assignació i desassignació|	Es fa automàticament mitjançant instruccions del compilador.|	Ho fa manualment el programador.|
|Desassignació|	No requereix desassignar variables.|	Cal una desassignació explícita.|
|Cost|	Menys|	Més|
|Implementació|	Una pila es pot implementar de 3 maneres basades en matrius simples, utilitzant memòria dinàmica i basades en llista enllaçada.|	L'heap es pot implementar mitjançant matrius i arbres.|
|Problema principal	|Falta de memòria|	Fragmentació de la memòria|
|Localitat de referència|	Instruccions de temps de compilació automàtica.|	Adequat|
|Flexibilitat|	Mida fixa|	El canvi de mida és possible|
|Temps d'accés|	Més ràpid |	Més lent|

We must optimize Strings. If we create a variable name2:
```
String name1="Jamila";
String name2="Jamila";

``` 
JVM, at the Memory Stack create name1, name2, but how they store the same, **they reference the same, at "Jamila" at the String Pool!!**REUSES THE SAME OBJECT AT THE STRING POOL.

>