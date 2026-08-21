package PartA;

import java.util.Scanner;

public class PatternCountQ5 {

	public static void main(String[] args) {
		int count = 0, position;
		String input, pattern;
		
		System.out.println("Enter some text: ");
		input = new Scanner(System.in).nextLine();
		
		System.out.println();
		System.out.println("Enter pattern to search (Maximum 4 character): ");
		pattern = new Scanner(System.in).nextLine();
		System.out.println();
		
		if(pattern.length() > 4)
			System.out.println("Maximum 4 characters");
		else {
			input = input.toLowerCase();
			pattern = pattern.toLowerCase();
			
			position = input.indexOf(pattern);
			
			while(position != -1) {
				count++;
				position = input.indexOf(pattern, position + 1);
			}
			System.out.println("Number of Times Pattern Aprears: " + count);
			System.out.println();
		}

	}

}
