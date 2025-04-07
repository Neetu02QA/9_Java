package Java_Basics;

import java.util.Scanner;

public class Prime_No {
/*
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter No ");
//		int n =scan.nextInt();
		int n = 10;
// 		We will check if 'n' is a prime number
		int count = 0;
		
// 		Loop through all numbers from 1 to 'n'		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		// If count equals 2, then 'n' is a prime number
        if (count == 2) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}*/
/*	
public static void main(String[] args) {
	System.out.println("Prime numbers between 1 and 10:"); 
	
	for (int num = 1; num <= 10; num++) { 
		int count = 0;  
	// To count the number of divisors 
	for (int i = 1; i <= num; i++) { 
		if (num % i == 0) { 
			count++; 
			// Increase count if num is divisible by i 
			} 
		} 
	if (count == 2) { 
		// A prime number has exactly 2 divisors (1 and itself) 
		System.out.print(num + " \n"); 
		} 
	}
		
 	}
}
*/

  
/*    
Let’s say n = 5. The program will check the divisors of 5:

For i = 1, 5 % 1 == 0 (so count becomes 1).
For i = 2, 5 % 2 != 0 (no increment in count).
For i = 3, 5 % 3 != 0 (no increment in count).
For i = 4, 5 % 4 != 0 (no increment in count).
For i = 5, 5 % 5 == 0 (so count becomes 2).
 */
    
 /* 
  
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No ");
		int n =scan.nextInt();
		int count = 0;
		
		for(int i = 2; i<=n/2;i++) {
			if(n%i==0) {
				count++;
				break;
				}
			}
		
		if(count==2) {
			System.out.println("N is a prime");
		}else {
			System.out.println("N is not a prime");
		}
	}
}

  */  
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);//17
		System.out.println("Enter No ");
		int n =scan.nextInt();
		int count = 0;
		
		//n=100
		//n/2
		//sqrt(n)
		
		for(int i = 2; i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				count++;
				break;
				}
			}
		
		if(count==1) {
			System.out.println("N is a prime");
		}else {
			System.out.println("N is not a prime");
		}
	}
}
	
	
	

