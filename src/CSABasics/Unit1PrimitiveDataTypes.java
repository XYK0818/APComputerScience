package CSABasics;

import static java.lang.Math.ceil;

public class Unit1PrimitiveDataTypes {// file name has to be the same as class name

    public static void print(String p) {
        System.out.println(p);
    }

    public static void main(String[] args) { // it doesn't matter if you have the braces here or start a new line

        System.out.println("Hello world!"); // what's the difference between print and println

//        space or new line in the code doesn't impact the output
        System.out.print("hello!" + "\n");
        String newLine = System.getProperty("line.separator");
        System.out.print("hello!" + newLine);
        System.out.println("world!");

        String name = "Mr. Bean"; //in Java, you have to specify data type when you declare a variable
        System.out.print("hello " + name);
        System.out.println("hello" + "name"); // code in double quote will be treated as a string(test information)

        char char1 = 'a';

//      Variables and Data Types

//        boolean: Ture or False
//        int: integer numbers
//        double: numbers with

        boolean isSleepy = true; // variable naming style
        int theAge = 42;
        double classAverage = 93.7;

        System.out.println("the average number is: " + classAverage);

//        Declaring Variables
        int x = 11; // int x; only initialized value can be printed
        System.out.println("x: " + x);
        x = 22; //int x = 22;
        System.out.println("x: " + x);

//        final: tell the programmer that this value can never be changed
        final int SPEED_OF_LIGHT = 3;
//        SPEED_OF_LIGHT = 4;

//        Expressions and Assignment Statements
        int a = 10;
        int b = 5; //3
        int c = 0;

        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);

//        order of operations
        c = 10 + 5 * 10 - 10 / 5;
        System.out.println(c);

//        Compound assignment operators
        int speed = 100;
        speed += 10; // speed = speed + 10
        System.out.println("speed: " + speed);
        speed -= 10;
        System.out.println("speed: " + speed);
        speed *= 10;
        System.out.println("speed: " + speed);
        speed /= 10;
        System.out.println("speed: " + speed);
        speed %= 10;
        System.out.println("speed: " + speed);

//        Increment and Decrement
        int index = 5;
        index ++;
        System.out.println(index);
        index --;
        System.out.println(index);

//        prefix and postfix
        System.out.println("index: " + index++);
        System.out.println("index: " + index);
        System.out.println("index: " + index--);
        System.out.println("index: " + index);
        System.out.println("index: " + ++index);
        System.out.println("index: " + index);
        System.out.println("index: " + --index);

//        casting: converting types
        int a1 = 22;
        double b1 = a1; // implicit casting
        System.out.println(a1 + " " + b1);

        double a2 = 22.0; // 22.6
//        int b2 = a2;
        int b2 = (int) a2; // explicit casting
        System.out.println(a2 + " " + b2);

        double e = 8.6;
        int eRound = (int) (e + 0.5);
        int eRound1 = (int) ceil(e);
        System.out.println(eRound);
        System.out.println(eRound1);

        double f = -8.6;
        int fRound = (int) (f - 0.5);
        System.out.println(fRound);

        int num1 = 9;
        int num2 = 10;
        System.out.println(num1/num2);

        System.out.println(13 - 3 * 6 / 4 % 3);


    }
}