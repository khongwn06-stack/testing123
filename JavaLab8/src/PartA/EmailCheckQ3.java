package PartA;

import java.util.Scanner;

public class EmailCheckQ3 {

	public static void main(String[] args) {
		String email;
		int index1, index2;
		
		System.out.print("Enter email address: ");
		email = new Scanner(System.in).nextLine();
		
		index1 = email.indexOf("@");
		if(index1 == -1)
			System.out.println("Missing @ Symbol.");
		else {
			index2 = email.lastIndexOf("@");
			if(index1 == index2)
				System.out.println("Exactly 1 @ found.");
			else
				System.out.println("More than 1 @ found.");
		}
	}

}
