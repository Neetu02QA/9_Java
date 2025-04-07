package Java_Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scanner_Buffer {
// Buffer is to read text efficiently/ string buffer is thread safe
	// string builder is nt thread safe
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader =	new BufferedReader(new 
				InputStreamReader(System.in));
//		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your marks");

		int marks = Integer.parseInt(reader.readLine());
//		int marks = scan.nextInt();
		if(marks>35) {
			System.out.println("Hey you passed");
		}else {
			System.out.println("You are failed");
		}
		
	}

}
