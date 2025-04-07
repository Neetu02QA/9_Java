package Java_Basics;

import java.util.Scanner;

public class Star_Pattern2 {

	public static void main(String[] args) {
		
		System.out.println("Try programiz.pro");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {  // Controls rows
            for (int j = 1; j <= n; j++) {  // Always prints 4 times
                System.out.print(i + " ");  // Print the row number
            }
            System.out.println();  // Move to next line after each row
        }
    }
}