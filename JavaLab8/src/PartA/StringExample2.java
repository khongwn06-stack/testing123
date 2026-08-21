package PartA;

public class StringExample2 {

	public static void main(String[] args) {
		String s1 = "Happy";
		System.out.println(s1);
		
		String s2 = s1.substring(3);
		System.out.println("substring(3)  : " + s2);
		
		String s3 = s1.substring(1,4);
		System.out.println("substring(1,4): " + s3);
		
		//print each character in a new line
		for(int i=0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
	}

}
