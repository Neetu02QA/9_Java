package Java_Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

//Java Program to Reverse a String
//Using for loop
//import java.io.*;
//import java.util.Scanner;

public class Reverse_String {
 public static void main(String[] args) {
   
     String s = "Hello"; 
    String r = "";
     char ch;
////ini check condition incr/decre
     for (int i = 0; i < s.length(); i++) {
           
//           // extracts each character
         ch = s.charAt(i);
//       
//           // adds each character in
//         // front of the existing string
        r = ch + r; 
    }
   
//     System.out.println(r);
//  ****************************************************************
	 
   //Java program to Reverse String
   //Using ByteArray
     
//     String s = "Hello";
//
//     // getBytes() method to convert string
//     // into bytes[].
//     byte[] arr = s.getBytes();
//
//     byte[] res = new byte[arr.length];
//
//     // Store reult in reverse order into the
//     // res byte[]
//     for (int i = 0; i < arr.length; i++)
//         res[i] = arr[arr.length - i - 1];
//
//     System.out.println(new String(res));
	//  ****************************************************************
	 
	// Java program to Reverse String
	// Using StringBuilder
//	 String s = "Hello";
//
//     // Object Initialised
//   StringBuilder res = new StringBuilder();
//
//   // Appending elements of s in res
//   res.append(s);
//
//   // reverse StringBuilder res
//   res.reverse();

   // print reversed String
//   System.out.println(res);
	//  ****************************************************************
   
	// Java program to Reverse a String by
	// Converting string to characters one
	// by one
	      
//       String s = "Hello";

      // Using toCharArray to copy elements
//       char[] arr = s.toCharArray();
//
//       for (int i = arr.length - 1; i >= 0; i--)
//           System.out.print(arr[i]);
//	 
	//  ****************************************************************
	   
//       
    // Java program to Reverse a String
    // Using ListIterator 
//       String s = "Hello";
//       
       // Copying elements to Character Array
//     char[] arr = s.toCharArray();
//   
//       // Creating new ArrayList
//     List<Character> l = new ArrayList<>();
//
//       // Adding char elements to ArrayList
//     for (char c : arr)
//         l.add(c);
//
//       // Reversing the ArrayList
//     Collections.reverse(l);
//   
//       // Using ListIterator
//     ListIterator it = l.listIterator();
//   
//     while (it.hasNext())
//         System.out.print(it.next());
//   
 //  ****************************************************************
     
  // Java program to Reverse the String
  // Using StringBuffer
//     String s = "Hello";
//
//     // Conversion from String object
//       // To StringBuffer
//     StringBuffer sbf = new StringBuffer(s);
//     
//       // Reverse String
//     sbf.reverse();
//       
//     System.out.println(sbf);
//     
//     //  ****************************************************************
 
     
	 //  ****************************************************************
	// Java program to reverse a string using Stack
	 
//	 String str = "Hello";
     
     //initializing a stack of type char
//     Stack<Character> s = new Stack<>();
//     
//     for(char c : str.toCharArray()){
//         //pushing all the characters
//         s.push(c);
//     }
//     
//     String res="";
//     
//     while(!s.isEmpty()){
//       
//         //popping all the chars and appending to temp
//         res+=s.pop();
//     }
//     
//     System.out.println(res);
	 
	 //  ****************************************************************
	 
	// Java Program to Reverse User Input String
	 
//	 Scanner sc = new Scanner(System.in);
     
     // Check if there is a line to read
//     if (sc.hasNextLine()) {
//       
//         // Taking string from user
//         String s = sc.nextLine();
//         
//         // Using StringBuilder to store  
//         // the reversed string
//         StringBuilder res = new StringBuilder();
//
//         // Traversing from the end to start
//         for (int i = s.length() - 1; i >= 0; i--) {
//             
//             // Adding element to the StringBuilder
//             res.append(s.charAt(i));
//         }
//
//         // Printing the reversed string
//         System.out.println(res.toString());
//     } else {
//         System.out.println("No input provided.");
//     }
//     
//     sc.close();  // Close the scanner to avoid resource leak

     
 }
}

