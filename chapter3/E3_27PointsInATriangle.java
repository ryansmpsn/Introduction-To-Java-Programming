package chapter3;
/*
 * Write a program that prompts the user to enter
 * a point with x- and y-coordinates and determines whether the point is inside the triangle.
 * 
 * Created by Ryan Simpson 9/20/2019
 */

import java.util.*;

public class E3_27PointsInATriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point's x- and y- coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if ((x > 100) || (x < 0) || (y > 200) || (y < 0))
			System.out.println("The point is not in the triangle.");
		else
			System.out.println("The point is in the triangle.");

		input.close();
	}
}