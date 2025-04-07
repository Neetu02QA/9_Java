package Java_Basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time_Basic_Program {

	public static void main(String[] args) {
		
	LocalDateTime now = LocalDateTime.now();
		System.out.println("Print time " + now );
		System.out.println("\n" );
		System.out.println("\"Todays Time\"");
		System.out.println("\tnow = " + now.format(DateTimeFormatter.ofPattern("MMM dd")));
	
//		String name = new String("Amigoscode");
//		System.out.println(name.contains("code"));
//		String code = new String("Amigoscode");
//		System.out.println(name.contains(code));
		
		String name = "Amigoscode";
		String code = "code";
		System.out.println(name.equals(code));
	}

}
