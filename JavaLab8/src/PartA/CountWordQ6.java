package PartA;

import java.util.Scanner;

public class CountWordQ6 {

	public static void main(String[] args) {
		String input,word;
		int pos1, pos2;
		
		System.out.println("Enter some text: ");
		input = new Scanner(System.in).nextLine();
		
		System.out.println("The Words are: ");
		pos1 = 0; //set pos1 to start of first word
		pos2 = input.indexOf(""); //set pos2 to position of first space
		
		if(pos2 == -1) //if only one word
			System.out.println(input);
		else {
			while(pos2 != -1) //repeat until no space found
			{
				//get the word
				word = input.substring(pos1, pos2);
				System.out.println(word);
				
				//set pos1 to start of next word
				pos1 = pos2 + 1;
				//set pos2 to position of next space
				pos2 = input.indexOf(" ", pos1 + 1);
			}
			
			//get last word
			word = input.substring(pos1);
			System.out.println(word);
		}

	}

}
