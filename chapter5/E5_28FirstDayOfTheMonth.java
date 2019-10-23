package chapter5;
/*
 * Write a program that prompts the user to enter the year 
 * and first day of the year, and displays the first day of each month in the year.
 * 
 * Created by Ryan Simpson 10/23/2019
 */

import java.util.*;

public class E5_28FirstDayOfTheMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the year: ");
		int year = input.nextInt();

		System.out.println("Enter the day of the year: ");
		int day = input.nextInt();
		input.close();

		String result;

		for (int month = 1; month <= 12; month++) {
			result = "";
			switch (month) {
			case 1:
				result += "January "; break;
			case 2:
				result += "February "; break;
			case 3:
				result += "March "; break;
			case 4:
				result += "April "; break;
			case 5:
				result += "May "; break;
			case 6:
				result += "June "; break;
			case 7:
				result += "July "; break;
			case 8:
				result += "August "; break;
			case 9:
				result += "September "; break;
			case 10:
				result += "October "; break;
			case 11:
				result += "November "; break;
			case 12:
				result += "December "; break;
			}
			
			result += "1, " + year + " is ";

			day %= 7;
			switch (day) {
			case 0:
				System.out.println(result + "Sunday"); break;
			case 1:
				System.out.println(result + "Monday"); break;
			case 2:
				System.out.println(result + "Tuesday"); break;
			case 3:
				System.out.println(result + "Wednesday"); break;
			case 4:
				System.out.println(result + "Thursday"); break;
			case 5:
				System.out.println(result + "Friday"); break;
			case 6:
				System.out.println(result + "Saturday"); break;
			}

			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				day += 31;
			else if (month == 4 || month == 6 || month == 9 || month == 11)
				day += 30;
			else {
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
					day += 29;
				else
					day += 28;
			}
		}
	}

}
