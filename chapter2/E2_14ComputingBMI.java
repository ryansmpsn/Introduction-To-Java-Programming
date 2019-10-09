package chapter2;
/*
 * Body Mass Index (BMI) is a measure of
 * health on weight. It can be calculated by taking your weight in kilograms and
 * dividing by the square of your height in meters. Write a program that prompts the
 * user to enter a weight in pounds and height in inches and displays the BMI.
 * 
 * Created by Ryan Simpson 9/11/2018
 */

import java.util.*;
public class E2_14ComputingBMI {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble() * 0.45359237;
		
		System.out.println("Enter height in inches:");
		double height = input.nextDouble() * 0.0254;
		double bmi = (weight / Math.pow(height, 2));
		input.close();
		
		System.out.println("BMI is " + bmi);
	}
}