package chapter3;
/*
 * Write a program
 * that prompts the user to enter a year, month, and day of the month, and
 * displays the name of the day of the week.
 * 
 * Created by Ryan Simpson 9/19/2019
 */

import java.util.*;

public class E3_21DayOfTheWeek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int q, m, j, k, year, weekDay;

		System.out.println("Enter year: (Ex. 2012) ");
		year = input.nextInt();

		System.out.println("Enter month: (1-12) ");
		m = input.nextInt();
		if (m == 1) {
			m = 13;
			year--;
		} else if (m == 2) {
			m = 14;
			year--;
		}

		System.out.println("Enter the day of the month: (1-31)");
		q = input.nextInt();

		j = year / 100;
		k = year % 100;

		weekDay = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		switch (weekDay) {
		case 0:
			System.out.println("The day of the week is Saturday.");
			break;
		case 1:
			System.out.println("The day of the week is Sunday.");
			break;
		case 2:
			System.out.println("The day of the week is Monday.");
			break;
		case 3:
			System.out.println("The day of the week is Tuesday.");
			break;
		case 4:
			System.out.println("The day of the week is Wednesday.");
			break;
		case 5:
			System.out.println("The day of the week is Thursday.");
			break;
		case 6:
			System.out.println("The day of the week is Friday.");
			break;
		}
		input.close();
	}
}