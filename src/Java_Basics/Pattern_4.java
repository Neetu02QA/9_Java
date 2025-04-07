package Java_Basics;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//17
		System.out.println("Enter No ");
		int n =sc.nextInt();//n =4
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				 System.out.print(count);
				count++;
			}
			System.out.println();
		}

	}

}
//int num = 1; // Start number for the pattern
//
//// Loop for each row (1 to 4)
//for (int i = 1; i <= 4; i++) {
//    // Loop for printing numbers in each row
//    for (int j = 1; j <= i; j++) {
//        System.out.print(num); // Print the current number
//        num++; // Increment the number after printing
//    }
//    System.out.println(); // Move to the next line after each row
//    System.out.println(" ");
//    