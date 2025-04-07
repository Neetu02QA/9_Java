package Java_Basics;

import java.util.Scanner;

public class Number_Pyramid {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int count = 0;
		//for spaces as I am goin down they are decresing

		for (int i = 1; i <= n; i++) {  
            // Print spaces
            for (int l = n; l > i; l--) {
                System.out.print(" "); // Fixed: Print spaces correctly
            }   
            // Print decreasing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k+" ");
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(); // Move to next line
        }
	}

}
//5
//	1 
//  2 1 2 
//3 2 1 2 3 

/*

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i++) {  
            // Print leading spaces for centering
            for (int l = n; l > i; l--) {
                System.out.print("  "); // Two spaces for proper alignment
            }   
            // Print decreasing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to next line
        }
    }
}
*/
