package JavaManipulations;

public class String_Buffer_Builder_12 {

	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer ("Hello World");
		StringBuffer buff = new StringBuffer ("TutorialsPoint");
		
		
//		StringBuffer(): creates an empty string buffer with the initial capacity of 16.
//		StringBuffer(String str): creates a string buffer with the specified string.
//		StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length.
		
		//	returns the current capacity of the String buffer i.e. 16 + 11
		System.out.println("capacity = " + stringBuffer.capacity());
			
		//	returns the current capacity of the String buffer i.e. 16 + 14
		System.out.println("capacity = " + buff.capacity());
		
		buff = new StringBuffer(" ");
		//	returns the current capacity of the String buffer i.e. 16 + 1
		System.out.println("capacity = " + buff.capacity());
		
		//	append character to the StringBuilder
		StringBuilder str = new StringBuilder("Hello ");
		System.out.println("string = " + str);
		
		StringBuilder str1 = new StringBuilder("Hello G");
		System.out.println("string = " + str1);
		
	
		
		
		
		
		
		
//		StringBuilder is non-synchronized i.e. not thread safe. It means two threads 
//		can call the methods of StringBuilder simultaneously.

//		Java StringBuilder class is used to create mutable (modifiable) string. The Java StringBuilder
//		class is same as StringBuffer class except that it is non-synchronized.

		
		
		
		

	}

}
