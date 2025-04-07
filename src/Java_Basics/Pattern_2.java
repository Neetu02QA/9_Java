package Java_Basics;

public class Pattern_2 {

	public static void main(String[] args) {
		
        // Loop for the rows (1 to 5)
        for (int i = 1; i <= 5; i++) {
            // Loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print numbers from 1 to i
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
/*
Explanation:
The outer loop (for (int i = 1; i <= 3; i++)) iterates over the rows, from 1 to 3.
The inner loop (for (int j = 1; j <= i; j++)) prints the numbers starting from 1 up to i for each row.
After printing the numbers for each row, System.out.println() moves to the next line.
*/