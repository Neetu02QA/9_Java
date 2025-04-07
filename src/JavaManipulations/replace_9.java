package JavaManipulations;

public class replace_9 {
	
	public static void main(String[] args) {
		
		String s1 = "My name is Salman";
		
		//replaces all occurences of char 
		String replaceString1 = s1.replace('a', 'e'); // replacing a letter with e letter in string
		System.out.println(replaceString1);
		
		//replaces all occurences of sequences of char
		String replaceString2 = s1.replace("Salman","Khan"); // replacing Salman string with Khan
		System.out.println(replaceString2);
		
			

	}
}
