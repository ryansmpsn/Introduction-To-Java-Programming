package chapter2;
/*
 * Write a program that prompts the user to enter a temperature between -58 ºF and
 * 41ºF and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
 * 
 * Created by Ryan Simpson 9/12/2018
 */

import java.util.*;
public class E2_17WindChillTemperature {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Farenheit between -58°F and 41°F: ");
		double temp = input.nextDouble();
		
		System.out.println("Enter the wind speed greater than or equal to 2 in MPH: ");
		double windSpeed = input.nextDouble();
		
		double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, .16) +
				0.4275 * temp * Math.pow(windSpeed, .16);
		System.out.println("The wind chill index is " + windChill);
		input.close();
	}
}
