package Java_Basics;

import java.util.Scanner;

public class Patterns_1 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter No ");
//		int n =scan.nextInt();
		
		int n = 5;
		// Loop for the rows (1 to 3)
		
        for (int i = 1; i <= n; i++) {
            // Loop for printing the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Print the current row number (i)
            }
           System.out.println();
//            System.out.println(""); // Move to the next line after each row
//          System.out.println("\n");
        }
    }
}

/*
 Explanation:
 
 i is rows
 i=1 then it wil got to j thn j<=1(n is changing to 1) so j equals to i meaning 1 
 condition satisfied then it will incre by 1 in j thn j is 2 which is nt equals to 1 come out of outer loop 
 bc condition is nt satisfied 
 
 j is cols
 
The outer loop (for (int i = 1; i <= 3; i++)) iterates through the rows, from 1 to 3.
The inner loop (for (int j = 1; j <= i; j++)) prints the current row number (i), repeated i times.
After printing each row, System.out.println() moves to the next line.
*/
 