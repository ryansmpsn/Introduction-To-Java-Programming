package chapter3;
/*
 * Write a program that prompts the user to enter a weight in pounds and height in inches and
 * displays the BMI.
 * 
 * Created by Ryan Simpson9/18/2019
 */

import java.util.*;

public class E3_06BMI {
	public static void main(String[] args) {
		double weight, feet, inches, height, bmi, weightInKilograms, heightInMeters;
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight in pounds");
		weight = input.nextDouble();

		System.out.println("Enter feet");
		feet = input.nextDouble();

		System.out.println("Enter inches");
		inches = input.nextDouble();
		input.close();

		height = (feet * 12) + inches;
		weightInKilograms = weight * KILOGRAMS_PER_POUND;
		heightInMeters = height * METERS_PER_INCH;
		bmi = weightInKilograms / (heightInMeters * heightInMeters);

		// Display result
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");

	}

}
