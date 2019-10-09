package chapter4;
/*
 * Write a program that prompts the user to enter two strings and
 * reports whether the second string is a substring of the first string.
 * 
 * Created by Ryan Simpson 9/25/2019
 */

import java.util.*;

public class E4_22CheckSubstring {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter string 1: ");
		String s1 = input.next();

		System.out.println("Enter string 2: ");
		String s2 = input.next();
		input.close();

		if (s1.contains(s2))
			System.out.println(s2 + " is a substring of " + s1);
		else
			System.out.println(s2 + " is not s substring of " + s1);
	}

}
