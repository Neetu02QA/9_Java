package Java_Basics;

import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number5");
		int n = scan.nextInt();
//		int n=5;
		for(int i=1;i<=n;i++) {
			if(i%2==0)
			System.out.println(i + " is Even No.");
		}
	}

}
