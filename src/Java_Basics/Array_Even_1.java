package Java_Basics;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Array_Even_1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//n=5
//		int count= 0;//no use
		int arr[]=new int[n];
//		int arr[] = {10,20,30,40,50};
		for(int i = 0; i<n; i++) {
			arr[i]= scan.nextInt();
			
		}
		
		for(int i = 0; i<n;i++) {
			if(arr[i]%2==0)
			System.out.println(arr[i]);
		}
	}

}
