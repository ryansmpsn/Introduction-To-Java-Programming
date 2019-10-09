package chapter3;
/*
 * Write a program that prompts the user to enter a temperature and a wind speed.
 * The program displays the wind-chill temperature if the input is valid; otherwise,
 * it displays a message indicating whether the temperature and/or wind speed is invalid.
 * 
 * Created by Ryan Simpson 9/19/2019
 */

import java.util.*;

public class E3_20WindChillTemperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Farenheit between -58°F and 41°F: ");
		double temperature = input.nextDouble();

		System.out.println("Enter the wind speed greater than or equal to 2 in MPH: ");
		double windSpeed = input.nextDouble();

		if (temperature < 41 && temperature > -58) {
			if (windSpeed >= 2) {
				double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, .16)
						+ 0.4275 * temperature * Math.pow(windSpeed, .16);
				System.out.printf("The wind chill index is %.2f", +windChill);

			} else
				System.out.println("Invalid wind speed.");
		} else
			System.out.println("Invalid temperatue.");

		input.close();
	}
}
