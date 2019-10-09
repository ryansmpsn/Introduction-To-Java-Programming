package chapter3;
/*
 * Write a program that reads three edges for
 * a triangle and computes the perimeter if the input is valid. Otherwise, display that
 * the input is invalid. The input is valid if the sum of every pair of two edges is
 * greater than the remaining edge.
 * 
 * Created by Ryan Simpson 9/19/2019
 */

import java.util.*;

public class E3_19PerimeterOfATriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three lengths of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		boolean validTriangle = ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));

		if (validTriangle) {
			double perimeter = side1 + side2 + side3;
			System.out.println("The perimiter of your triangle is " + perimeter + ".");

		} else {
			System.out.println("Input is not a valid triangle.");
			input.close();
		}
	}
}