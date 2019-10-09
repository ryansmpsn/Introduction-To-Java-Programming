package chapter5;
/*
 * Write a program that prompts the user to enter two positive integers and displays the gcd.
 * 
 * Created by Ryan Simpson 10/2/2019
 */

import java.util.*;

public class E5_14GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two posistive integers: ");
		int int1 = input.nextInt();
		int int2 = input.nextInt();

		int gcd = int1 < int2 ? int1 : int2;

		while (int1 % gcd != 0 || int2 % gcd != 0) {
			gcd--;
		}

		System.out.println("The greatest common divisor for " + int1 + " and " + int2 + " is " + gcd);
		input.close();
	}
}