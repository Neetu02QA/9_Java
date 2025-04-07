package Java_Basics;

import java.util.*;

public class Code_Arrays {

	public static void main(String[] args) {
		
		int [] numbers = {2, 0, 1, 4, 100};
		String [] names = {"Ali", "Maria"};
		
		System.out.println(names);
		System.out.println(Arrays.toString(names));
//		[Ljava.lang.String;@6bf2d08e
//		[Ali, Maria]
//		Method						Output									Use Case
//		arr.toString()				Type and hash code (e.g., [I@1b6d3586)	Identifying array object references.
//		Arrays.toString(arr)		Contents as [1, 2, 3]					Single-dimensional arrays.
//		Arrays.deepToString(arr)	Contents of nested arrays				Multi-dimensional arrays.

		int[] arr = {1, 2, 3};
		System.out.println(arr.toString());
		
		int[] arr1 = {1, 2, 3};
		System.out.println(Arrays.toString(arr1));  // Prints the array elements
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
		System.out.println(Arrays.toString(matrix));        // Prints the reference of sub-arrays
		System.out.println(Arrays.deepToString(matrix));    // Prints all elements


	}

}
