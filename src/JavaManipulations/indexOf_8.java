package JavaManipulations;

public class indexOf_8 {

	public static void main(String[] args) {
		
		String s1 = "My name is Salman";
		
		//passing char value
		int index1 = s1.indexOf('a'); // a letter is on 4th position
		System.out.println(index1);
	
		//passing substring
		int index2 = s1.indexOf("is"); // is on 8th position
		System.out.println(index2);
		
		//passing char value from index
		int index3 = s1.indexOf("a", 5); //after 5th position it takes a letter on 12 position
		System.out.println(index3);
		
		//passing substring from index
		int index4 = s1.indexOf("is", 10); // after 10 th positin there is no position for is string
		System.out.println(index4);
	
	

	}

}
