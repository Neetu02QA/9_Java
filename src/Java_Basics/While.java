package Java_Basics;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No for while loop");
		int n =scan.nextInt();
		int i = 1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}

}
