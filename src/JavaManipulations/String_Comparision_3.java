package JavaManipulations;

public class String_Comparision_3 {

	public static void main(String[] args) {
	
		String s = "Hell";
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hello";
		
		//Using equals () method
		System.out.println(s1.equals(s2));//true
		System.out.println(s.equals(s1));//false
		
		//Using == operator
		String s4 = new String ("Java");
		System.out.println(s1==s2);//true (because both refer to same instance)
		System.out.println(s3==s4);//false (because s3 refers to instance created in non pool)
		
		//By compareTo() method 
		System.out.println(s.compareTo(s2)); //return -1 because s<s2
		System.out.println(s1.compareTo(s2));//return 0 because s1==s2
		System.out.println(s2.compareTo(s)); //return 1 because s2>s
		

	}

}
