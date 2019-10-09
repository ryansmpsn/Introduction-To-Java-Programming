package chapter1;

/*
 * Assume a runner runs 14 kilometers in 45 minutes and 30
 * seconds. Write a program that displays the average speed in miles per hour.
 *
 * Created by Ryan Simpson 7/6/18
 */

public class E1_10AvgSpeedInMiles {
	public static void main(String[] args) {

		double kilometers = 14;
		double miles = kilometers / 1.6;

		double rate = (45.5 * 1 / 60);

		double MPH = miles / rate;
		System.out.println(
				"If a runner runs 14 kilometers in 45 minutes and 30 seconds. The average speed in miles is " + MPH);

	}
}