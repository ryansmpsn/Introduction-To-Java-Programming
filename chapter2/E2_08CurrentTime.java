package chapter2;
/*
 * ShowCurrentTime.java, gives a program that displays
 * the current time in GMT. Revise the program so that it prompts the user to enter
 * the time zone offset to GMT and displays the time in the specified time zone.
 *
 *Created by Ryan Simpson 7/6/18
 */

import java.util.*;
public class E2_08CurrentTime {

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
		
		System.out.println("The current time is " + currentHour
				+ ":" + currentMinute + ":" + currentSecond);
		input.close();
	}

}
