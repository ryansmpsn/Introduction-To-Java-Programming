package chapter3;
/*
 * Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and display
 * the future day of the week
 * 
 * Created by Ryan Simpson 9/16/2019
 */

import java.util.*;

public class E3_05FindFutureDates {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter an integer for today's day of the week: (Sunday is 0)");
		int today = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int future = input.nextInt() + today;
		
		switch (today) {
		case 0: System.out.println("Today is Sunday."); break;
		case 1: System.out.println("Today is Monday."); break;
		case 2: System.out.println("Today is Tuesday."); break;
		case 3: System.out.println("Today is Wednesday."); break;
		case 4: System.out.println("Today is Thursday."); break;
		case 5: System.out.println("Today is Friday."); break;
		case 6: System.out.println("Today is Saturday.");
		}
		
		switch (future % 7) {
		case 0: System.out.println("The future day is Sunday."); break;
		case 1: System.out.println("The future day is Monday."); break;
		case 2: System.out.println("The future day is Tuesday."); break;
		case 3: System.out.println("The future day is Wednesday."); break;
		case 4: System.out.println("The future day is Thursday."); break;
		case 5: System.out.println("The future day is Friday."); break;
		case 6: System.out.println("The future day is Saturday.");
		}
		
		input.close();
	}
}
