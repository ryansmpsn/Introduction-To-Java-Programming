package chapter3;

/*
 * Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome number.

 * Created by Ryan Simpson 9/18/2019
 */

import java.util.*;

public class E3_12PalindromeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1 = 1000;

		while (num1 > 999) {
			System.out.println("Enter a three-digit integer: ");
			num1 = input.nextInt();
		}

		int compare1 = num1 % 10;
		int compare2 = num1 / 100;

		if (compare1 == compare2)
			System.out.println(num1 + " is a palindrome number.");
		else
			System.out.println(num1 + " is not a palindrome number.");
		input.close();
	}
}
