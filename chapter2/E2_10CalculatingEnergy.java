package chapter2;
/* 
 * Write a program that calculates the energy needed
 * to heat water from an initial temperature to a final temperature. Your program
 * should prompt the user to enter the amount of water in kilograms and the initial
 * and final temperatures of the water.
 * 
 * Created by Ryan Simpson 9/11/2018
 */

import java.util.*;
public class E2_10CalculatingEnergy {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		double q, m, finalTemperature, initialTemperature;
		
		System.out.println("Enter the amount of water in kilograms: ");
		m = input.nextDouble();
		
		System.out.println("Enter the initial temperature in celsius: ");
		initialTemperature = input.nextDouble();
		
		System.out.println("Enter the final temperature in celsius: ");
		finalTemperature = input.nextDouble();
		
		q = (m * (finalTemperature - initialTemperature) * 4184);
		System.out.println("The energy needed is " + q);
		input.close();
		
	}

}
