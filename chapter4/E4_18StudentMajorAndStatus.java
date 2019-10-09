package chapter4;
/*
 * Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters.
 * 
 * Created by Ryan Simpson 9/24/2019
 */

import java.util.*;

public class E4_18StudentMajorAndStatus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two characters");
		String s = input.next();
		input.close();

		char major = s.charAt(0);
		char year = s.charAt(1);

		switch (Character.toUpperCase(major)) {
		case 'M':
			System.out.println("Mathematics");
			break;
		case 'C':
			System.out.println("Computer Science");
			break;
		case 'T':
			System.out.println("Information Technology");
			break;
		default:
			System.out.println("Invalid input");

		}

		switch (year) {
		case '1':
			System.out.println("Freshman");
			break;
		case '2':
			System.out.println("Sophomore");
			break;
		case '3':
			System.out.println("Junior");
			break;
		case '4':
			System.out.println("Senior");
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}
