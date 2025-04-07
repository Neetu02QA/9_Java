package Java_Basics;

import java.util.Scanner;

public class Sum_ {

	public static void main(String[] args) {
		
		System.out.println("Try programiz.pro");
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			sum=sum+i; //1+2+3+4+5
//			System.out.println(i);
//			System.out.println(sum);
          System.out.println(i  + " = " + sum);
		}
		System.out.println(sum);
	}

}

/*
 import java.util.Scanner;

public class SumFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = (n * (n + 1)) / 2; // Using formula
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}

 */
 