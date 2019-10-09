package chapter3;
/*
 * Write a program to display the hour using a 12-hour clock.
 * 
 * Created by Ryan Simpson 9/20/2019
 */

import java.util.Scanner;

public class E3_30CurrentTime {
	public static void main(String[] args) {
		System.out.println("Enter the timezone to offset GMT: ");
		Scanner input = new Scanner(System.in);

		long offset = input.nextInt();
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = (totalHours + offset) % 24;

		System.out.println("The current time is " + currentHour % 12 + ":" + currentMinute + ":" + currentSecond);
		
		if (currentHour > 12)
			System.out.println("AM");
		
		else
			System.out.println("PM");
		
		input.close();
	}

}
