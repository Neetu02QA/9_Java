package Java_Basics;

public class Star_Pattern1 {

	public static void main(String[] args) {

        char num = '*'; // Start number for the pattern
    	
        // Loop for each row (1 to 4)
        for (int i = 1; i <= 5; i++) {
           
        	// Loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); // Print the current number
//                num++; // Increment the number after printing
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