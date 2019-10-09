package chapter3;
/*
 * Write a program to display the nonzero denominations only, using singular words for single
 * units such as 1 dollar and 1 penny, and plural words for more than one unit such
 * as 2 dollars and 3 pennies.
 * 
 * Created by Ryan Simpson 9/18/2019
 */

import java.util.*;

public class E3_07MonetaryUnits {
public static void main(String[] args) {
		
	 Scanner input = new Scanner(System.in);
	
	 // Receive the amount
	 System.out.print(
	 "Enter an amount in double, for example 11.56: ");
	 double amount = input.nextDouble();
	input.close();
	 int remainingAmount = (int)(amount * 100);
	
	 // Find the number of one dollars
	int numberOfOneDollars = remainingAmount / 100;
	 remainingAmount = remainingAmount % 100;
	
	 // Find the number of quarters in the remaining amount
	 int numberOfQuarters = remainingAmount / 25;
	 remainingAmount = remainingAmount % 25;
	
	 // Find the number of dimes in the remaining amount
	 int numberOfDimes = remainingAmount / 10;
	 remainingAmount = remainingAmount % 10;
	
	 // Find the number of nickels in the remaining amount
	 int numberOfNickels = remainingAmount / 5;
	 remainingAmount = remainingAmount % 5;
	
	 // Find the number of pennies in the remaining amount
	 int numberOfPennies = remainingAmount;
	
	 // Display results
	 System.out.println("Your amount " + amount + " consists of");
	 if (numberOfOneDollars > 1) {
	 System.out.println(" " + numberOfOneDollars + " dollars");}
		 else if (numberOfOneDollars == 1)
			 System.out.println(" " + numberOfOneDollars + " dollar");
		 
	if (numberOfQuarters > 1) {
	 System.out.println(" " + numberOfQuarters + " quarters ");}
	 	else if (numberOfQuarters == 1)
		 System.out.println(" " + numberOfQuarters + " quarter");
	
	 if (numberOfDimes > 1) {
	 System.out.println(" " + numberOfDimes + " dimes");}
	 	else if (numberOfDimes == 1)
		 System.out.println(" " + numberOfDimes + " dime");
	 
	 if (numberOfNickels > 1) {
	 System.out.println(" " + numberOfNickels + " nickels");}
	 	else if (numberOfNickels == 1)
		 System.out.println(" " + numberOfNickels + " nickel");
	 
	 if (numberOfPennies > 1) {
	 System.out.println(" " + numberOfPennies + " pennies");}
	 	else if (numberOfPennies == 1)
		 System.out.println(" " + numberOfPennies + " pennie");
	}
}
