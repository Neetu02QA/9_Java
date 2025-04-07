package Java_Basics;

import java.util.Scanner;


public class Data_Types_Input {




	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer input
        int intValue = scanner.nextInt();

        // Read double input
        double doubleValue = scanner.nextDouble();
        
        // Consume the newline character left by nextDouble()
        scanner.nextLine();//bc of ambuiguity

        // Read string input
        String stringValue = scanner.nextLine();

        scanner.close(); // Close scanner

        // Print outputs as required
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
    }
}