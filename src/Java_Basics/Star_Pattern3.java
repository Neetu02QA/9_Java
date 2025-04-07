package Java_Basics;

import java.util.Scanner;

public class Star_Pattern3 {

	public static void main(String[] args) {
		
		
		System.out.println("Try programiz.pro");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count=0;
		
		for (int i = 1; i <= n; i++) {  // Controls rows
            for (int k = n; k > i; k--) {  // Always prints 4 times
                System.out.print(" ");  // Print the row number
            }
            for (int j = 1; j <= i; j++) {  // Always prints 4 times
                System.out.print("* ");  // Print the row number
            }
            System.out.println("");  // Move to next line after each row
        }
    }
}