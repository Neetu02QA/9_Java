package Java_Basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	/*	Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Nos - ");
		int n = scan.nextInt();
		int count = 0;
		
		int arr[]=new int[n];
		for(int i = 0; i<n; i++) {
			arr[i]=scan.nextInt();
		}
		for(int i = 0; i<n;i++) {
			int x = arr[i];
			while(x!=0) {
				int rem=x%10;
				
			}
		}*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Nos - ");
		int n = scan.nextInt();
		
		int arr[]=new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i]=scan.nextInt();
		}
		
		//123
		int sum = 0;
		for(int i = 0; i<n;i++) {
			int x = arr[i];
			int temp = x;
			while(x!=0) {
				int rem=x%10;
				sum=sum+rem*rem*rem;
				x=x/10;
				
			}
			if(sum==temp)
				System.out.println(temp);
		}
		
		
		}

	}
		
/*
 * 5 is array
123 234 344 153 456

 * 
 123
 r - 3
 s=0+27 //s- 27
 x=12
 r - 2
 s - 27+8 - 35
 x - 1
 r - 1
 
 
 */		
	
