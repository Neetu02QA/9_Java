package Java_Basics;

import java.util.Scanner;

public class Nested_Loop {

	public static void main(String[] args) {
	

		System.out.println("Try programiz.pro");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 1; // Starting number

        for (int i = 1; i <= 5; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for columns in each row
                System.out.print(count + " "); // Print the number with a space
                count++; // Increment the number
            }
            System.out.println(); // Move to the next line after each row
        }
		
		
	}

}
