package chapter2;
/*
 * Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 * 
 * Created by Ryan Simpson 7/6/18
 */

import java.util.*;

public class E2_07NumberOfYears {

	public static void main(String[] args) {

		System.out.println("Enter number of minutes: ");
		Scanner input = new Scanner(System.in);

		long minutes = input.nextLong();
		long years = minutes / 60 / 24 / 365;
		long days = minutes / 60 / 24 % 365;

		System.out.println(minutes + " is approximatly " + years + " years, and " + days + " days.");
		input.close();

	}

}
