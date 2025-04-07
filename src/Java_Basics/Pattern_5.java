package Java_Basics;

public class Pattern_5 {

	public static void main(String[] args) {
		
//	for spaces as i am going down they are decreasing
//		 1
//		212
//	   32123
		int n = 5;
		for (int i=1;i<=n;i++) {
			for(int l=n;l>i;l--) {
				System.out.println(" ");
		}
			for(int k=i;k>=1;k--) {
				System.out.println(k+"");
			}
			for(int j = 2;j<=i;j++) {
				System.out.println(j+"");
			}
			System.out.println();
	}
	}
}//not resolved 