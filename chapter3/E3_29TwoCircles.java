package chapter3;
/*
 * Write a program that prompts the user to enter the center
 * coordinates and radii of two circles and determines whether the second circle is
 * inside the first or overlaps with the first.
 * 
 * Created by Ryan Simpson 9/20/2019
 */

import java.util.*;

public class E3_29TwoCircles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();

		System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();

		double distance = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5D);

		if (distance + radius2 <= radius1)
			System.out.println("circle2 is inside circle1");

		else if (distance <= radius1 + radius2)
			System.out.println("circle2 overlaps circle1");

		else
			System.out.println("circle2 does not overlap circle1");

		input.close();
	}
}
