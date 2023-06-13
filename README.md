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
