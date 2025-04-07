package Java_Basics;

import java.util.Scanner;

public class ConditionalCheck {
	public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Read input
        scanner.close();  // Close scanner to prevent memory leaks

        // Apply conditions
        if (N % 2 == 1) {
        if (N % 2 != 0) {
            System.out.println("Weird");  // If N is odd
        } else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N > 20) {
            System.out.println("Not Weird");
        }
    }
}
}
