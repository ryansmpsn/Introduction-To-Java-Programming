package chapter3;
/*
 *  The program prompts the user to enter the weight and price 
 *  of the each package and displays the one with the better price.
 * 
 * Created by Ryan Simpson 9/20/2019
 */

import java.util.*;

public class E3_33CompareCost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight and price for package 1:");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.println("Enter weight and price for package 2:");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		if ((price1 / weight1) > (price2 / weight2))
			System.out.println("Package 1 has a better price.");
		
		else if ((price1 / weight1) == (price2 / weight2))
			System.out.println("The two packages have the same price.");

		else
			System.out.println("Package 2 has a better price.");

		input.close();
	}

}
