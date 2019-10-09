package chapter4;
/*
 * Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant.
 * 
 * Created by Ryan Simpson 9/24/2019
 */

import java.util.*;

public class E4_13VowelOrConsonant {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		String i = input.next();
		input.close();
		
		char ch = i.charAt(0);
		ch = Character.toUpperCase(ch);
		
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a vowel.");
		}
		else
			System.out.println(ch + " is a consonant.");
	}

}
