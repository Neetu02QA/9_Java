package Java_Basics;

import java.util.Arrays;

public class Code_Loops {

	public static void main(String[] args) {
		
		int[] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
		String[] names = {"Anna", "Ali"};
		
		Arrays.stream(numbers).forEach(System.out::println);
		Arrays.stream(names).forEach(System.out::println);
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("Enhanced for loop");
//		enhanced for loop will  not give access to index 
		for (int number : numbers) {
			System.out.println(number);
		}
		
		for (String name : names) {
			System.out.println(name);
			
			
		}
	}

}
