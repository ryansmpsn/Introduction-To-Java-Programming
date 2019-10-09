package chapter2;
/*
 * Rewrite Listing 2.10, ComputeChange
 * .java, to fix the possible loss of accuracy when converting a double value to an
 * int value. Enter the input as an integer whose last two digits represent the cents.
 * 
 * 
 * For example, the input 1156 represents 11 dollars and 56 cents.
 * Created by Ryan Simpson 9/12/2018
 */

import java.util.*;
public class E2_22MonetaryUnits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in double, for example 1156 for 11.56: ");
		int amount = input.nextInt();
		
		int remainingAmount = (int)(amount * 100);
		
		int numberOfOneDollars = remainingAmount / 10000;
		remainingAmount = remainingAmount % 10000;
		
		int numberOfQuarters = remainingAmount / 2500;
		remainingAmount = remainingAmount % 2500;
		
		int numberOfDimes = remainingAmount / 1000;
		remainingAmount = remainingAmount % 1000;
		
		int numberOfNickels = remainingAmount / 500;
		remainingAmount = remainingAmount % 500;
		
		int numberOfPennies = remainingAmount / 100;
		
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
		input.close();
	}
}
