package Operators;


//Java Program to implement
//Unary Operators
import java.io.*;

//Driver Class
public class GFG2 {
 // main function
public static void main(String[] args)
{
   // Interger declared
   int a = 10;
   int b = 10;

   // Using unary operators
   System.out.println("Postincrement : " + (a++));
   System.out.println("Preincrement : " + (++a));

   System.out.println("Postdecrement : " + (b--));
   System.out.println("Predecrement : " + (--b));
}
}
