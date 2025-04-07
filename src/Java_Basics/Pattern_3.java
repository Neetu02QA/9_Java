package Java_Basics;

public class Pattern_3 {

    public static void main(String[] args) {
        int num = 1; // Start number for the pattern
    	
        // Loop for each row (1 to 4)
        for (int i = 1; i <= 5; i++) {
            // Loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); // Print the current number
                num++; // Increment the number after printing
            }
            System.out.println(); // Move to the next line after each row
            System.out.println(" ");
            
      /*      int num = 1; // Start number for the pattern

            // Loop for each row (1 to 4)
            for (int i = 1; i <= 4; i++) {
                // Loop for printing numbers in each row
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " "); // Print the current number followed by space
                    num++; // Increment the number after printing
                }
                System.out.println(); // Move to the next line after each row
        */
        }
    }
}

       
  
//num++ j=2 com out of loop
// i = 2 bc num is incremented by 2








/*
 
 Explanation:
The num variable keeps track of the next number to print, starting from 1.
The outer loop (for (int i = 1; i <= 4; i++)) controls the number of rows (4 in this case).
The inner loop (for (int j = 1; j <= i; j++)) prints the numbers in each row, and the num variable is incremented after each print.
After printing each row, System.out.println() moves to the next line.

 */