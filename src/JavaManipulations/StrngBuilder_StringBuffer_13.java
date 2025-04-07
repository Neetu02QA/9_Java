package JavaManipulations;

public class StrngBuilder_StringBuffer_13 {
	
	public static void main(String[] args) {
		
//		Use StringBuilder for String Concatenation(If thread safety is not a concern, use StringBuilder instead of StringBuffer. 
//		StringBuilder is faster because it’s not synchronized.And instead of creating new string objects each time.)



		StringBuilder stringBuilder = new StringBuilder(); 
        
        stringBuilder.append("Hello"); 
        stringBuilder.append(" "); 
        stringBuilder.append("World"); 
          
        String result = stringBuilder.toString(); 
        
        System.out.println("StringBuilder result: " + result); // Output: StringBuilder result: Hello World 
        
        
        
//        Use StringBuilder or StringBuffer for String Modification
        
        StringBuilder sb = new StringBuilder("Hello World"); 
        sb.append("!"); 
        sb.insert(5, ","); 
        sb.delete(5, 7); 
        String result1 = sb.toString(); // "Hello, World!" 
        
        System.out.println("StringBuilder result1: " + result1); // Output: StringBuilder result: Hello World 
        

    } 
} 
		
		
	
	


