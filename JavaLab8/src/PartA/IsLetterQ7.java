package PartA;

import java.util.Scanner;

public class IsLetterQ7 {

	public static void main(String[] args) {
		String input, output1;
		
		System.out.println("Enter some text: ");
		input = new Scanner(System.in).nextLine();
		
		output1 = input.toUpperCase();
		System.out.println("Changed to uppercase: " + output1);
		
		System.out.println("Letters are: ");
		for(int i=0; i<input.length(); i++) {
			if((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') 
					|| 
				(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'))
				
				System.out.println(input.charAt(i));
		}

	}

}
