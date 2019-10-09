package chapter3;
/*
 * Write a program that prompts the user
 * to enter the month and year and displays the number of days in the month.
 * 
 * Created by Ryan Simpson 9/18/2019
 */

import java.util.*;

public class E3_11DaysInAMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int daysInMonth = 0;
		String nameOfMonth = "unknown";
		
		System.out.println("Enter the month for the amount of days to be displayed:");
		int month = input.nextInt();
		
		System.out.println("Enter the year:");
		int year = input.nextInt();
		input.close();
		
		switch (month) {
		case 1:
			nameOfMonth = "January" ;
			daysInMonth = 31;
			break;
		case 2:
			nameOfMonth = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
	            daysInMonth = 29;

	        } else {
	            daysInMonth = 28;
	        }
			break;
		case 3:
			nameOfMonth = "March";
			daysInMonth = 31;
			break;
		case 4:
			nameOfMonth = "April";
			daysInMonth = 30;
			break;

		case 5:
			nameOfMonth = "May";
			daysInMonth = 31;
			break;
		case 6:
			nameOfMonth = "June";
			daysInMonth = 31;
			break;
		case 7:
			nameOfMonth = "July";
			daysInMonth = 31;
			break;
		case 8:
			nameOfMonth = "August";
			daysInMonth = 31;
			break;
		case 9:
			nameOfMonth = "September";
			daysInMonth = 30;
			break;
		case 10:
			nameOfMonth = "October";
			daysInMonth = 31;
			break;
		case 11:
			nameOfMonth = "November";
			daysInMonth = 30;
			break;
		case 12:
			nameOfMonth = "December";
			daysInMonth = 31;
			break;
		}

		System.out.println("The amount of days in " + nameOfMonth + " " + year + " is " + daysInMonth);
	}
}
