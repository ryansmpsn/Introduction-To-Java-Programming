package chapter3;
/*
 * Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB.
 * 
 * Created by Ryan Simpson 9/20/2019
 */

import java.util.*;

public class E3_31CurrencyExchange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();

		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int toggle = input.nextInt();

		System.out.println("Enter the dollar amount: ");
		double dollars = input.nextDouble();

		double changed;

		switch (toggle) {
		case 0:
			changed = dollars * rate;
			System.out.println("$" + dollars + " is " + changed + " yuan.");
			break;
		case 1:
			changed = dollars / rate;
			System.out.printf(dollars + " yuan " + " is $" + changed);
			break;
		}
		input.close();
	}

}
