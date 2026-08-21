package PartA;

import java.util.Scanner;

public class EmailCheckQ2 {

	public static void main(String[] args) {
		String email, subString;
		int index;
		
		System.out.println("Enter email address: ");
		email = new Scanner(System.in).nextLine();
		
		//check for the '@'
		index = email.indexOf("@");
		if(index != -1)
			System.out.printf("@ found at index %d\r\n", index);
		else
			System.out.println("No @ found.");
		
		//check for the last group characters, after the last '.'
		index = email.lastIndexOf(".");
		if(index == -1)
			System.out.println("No dot found.");
		else {
			subString = email.substring(index+1);
			System.out.println("The characters after the last '.' symbol are -> '" + subString + "'");
		}

	}

}
