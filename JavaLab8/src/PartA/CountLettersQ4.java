package PartA;

import java.util.Scanner;

public class CountLettersQ4 {
	
	public static void main(String[] args) {
		String str;
		int numOfLetters;
		
		System.out.print("Enter some text: ");
		str = new Scanner(System.in).nextLine();
		
		numOfLetters = countLetters(str);
		System.out.println("The number of letters in '" + str + "' is: " + numOfLetters);
	}
	
	private static int countLetters(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isLetter(c))
				count++;
		}
		
		return count;
	}
}
