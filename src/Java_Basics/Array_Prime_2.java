package Java_Basics;

import java.util.Scanner;

public class Array_Prime_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Nos - ");
		int n = scan.nextInt();//n=5
		
		int arr[]=new int[n];
		
		// Input values into array
		for(int i = 0; i<n; i++) {//indexing 0 = 10 value//n= 5 first value    
			arr[i]= scan.nextInt();	
		}
		
		for(int i = 0; i<n; i++) {// i is index of array
			int x = arr [i];
			int count = 0;// Reset count for each number
			
			for(int j=1;j<=x;j++) { //j is second value 20				if(x%j==0) {
				if (x % j == 0) { // Check divisibility
	                 count++;
				}
			}
			if(count==2){ // Prime numbers have exactly two divisors
			System.out.println(x);
			}

		}
	}
}

