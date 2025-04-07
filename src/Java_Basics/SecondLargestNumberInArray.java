package Java_Basics;

import java.util.Arrays;

public class SecondLargestNumberInArray {
	
//	public static void print2Largest(int arr[]){
//
//		int size = arr.length;
//		if(size<2){
//		System.out.println("Invalid input");
//		//return;
//		}
//		Arrays.sort(arr);
//		System.out.println(arr[size-2]);
//		}
//
//		public static void main(String[]args){
//
//		int arr[] = {1,4,5,35,34};
//		print2Largest(arr);
//		
//		}
	
	public static void main(String[]args){
		
		int array[] = {1,4,5,35,34};
		Arrays.sort(array);
		System.out.println("First highest element in array = " + array[array.length-1]);
//		System.out.println("");
		System.out.print("\n");
		
		System.out.println("First highest element in array = " + array[array.length-2]);
	}
}
