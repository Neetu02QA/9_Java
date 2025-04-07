package Java_Basics;

import java.util.Scanner;

public class Sum_with_EvenNo {

	public static void main(String[] args) {
	

		System.out.println("Try programiz.pro");
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			if(i%2==0)
			sum=sum+i; //2+4+6+8+10
//			System.out.println(i);
//			System.out.println(sum);
          System.out.println(i  + " = " + sum);
		}
		System.out.println(sum);

	}

}
