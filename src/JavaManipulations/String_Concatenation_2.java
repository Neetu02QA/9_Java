package JavaManipulations;

public class String_Concatenation_2 {

	public static void main(String[] args) {
		
		String s = "Hello";
		String str = "World";
		//Using concat() method
		String str1 = s.concat(str);
		String str2 = "Hello".concat("World");
		//Using + operator
		String str3 = s + str;
		String str4 = "Hello"+" World";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	
		
		
		
		

	}

}
