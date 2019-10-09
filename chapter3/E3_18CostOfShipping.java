package chapter3;
/*
 * Write a program that prompts the user to enter the weight of the package and
 * display the shipping cost.
 * 
 * Created by Ryan Simpson 9/19/2019
 */

import java.util.*;

public class E3_18CostOfShipping {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the weight in pounds of the package to be shipped: ");
		double packageWeight = input.nextDouble();
		input.close();

		if (packageWeight < 0) {
			System.out.println("Invalid weight");
		} else if (packageWeight <= 1) {
			System.out.printf("The cost is $%.2f", +3.5 * packageWeight);
		} else if (packageWeight <= 3) {
			System.out.printf("The cost is $%.2f", +5.5 * packageWeight);
		} else if (packageWeight <= 10) {
			System.out.printf("The cost is $%.2f", +8.5 * packageWeight);
		} else if (packageWeight <= 50) {
			System.out.printf("The cost is $%.2f", +10.5 * packageWeight);
		} else
			System.out.println("The package cannot be shipped.");
	}
}
