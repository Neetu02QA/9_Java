package Java_Basics;

import java.util.Scanner;

public class Prod {

	public static void main(String[] args) {
//		Factorial of 5
		
//		System.out.println("Try programiz.pro");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int prod=1;
//		
//		for(int i=1;i<=n;i++) {
//			prod=prod*i;
//	}
//		System.out.println(prod);
//}
//}
        int n = 5;
        long fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact *= i; // fact = fact * i
//            System.out.println(i);
//            System.out.println(fact);
            System.out.println(i  + " = " + fact);
        }
        
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
