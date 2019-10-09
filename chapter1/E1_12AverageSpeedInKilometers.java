package chapter1;

/*
 * 
 * Assume a runner runs 24 miles in 1 hour, 40 minutes,
 * and 35 seconds. Write a program that displays the average speed in kilometers per
 * hour.
 * 
 * Created by Ryan Simpson 7/6/18
 */


public class E1_12AverageSpeedInKilometers {

	public static void main(String[] args) {

		double miles = 24;
		double kilometers = miles * 1.6;
		
		double hours = 1;
		double minutes = 40;
		double seconds = 35;
		
		double rate = ((seconds / 3600) + (minutes / 60) + hours);
	
		double KPH = kilometers / rate;
		
		System.out.println("If a runner runs 24 miles in 1 hour 40 minutes and 30 seconds. "
				+ "The average speed in kilometers per hour is "
				+ KPH);
	}

}