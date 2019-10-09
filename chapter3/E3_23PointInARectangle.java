package chapter3;
/*
 * Write a program that prompts the user to enter
 * a point (x, y) and checks whether the point is within the rectangle centered at
 * (0, 0) with width 10 and height 5.
 * 
 * Created by Ryan Simpson 9/20/2019
 */

import java.util.*;

public class E3_23PointInARectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point with two coordinates: ");
		int x = input.nextInt();
		int y = input.nextInt();
		input.close();

		if (x <= 10 / 2 && y <= 5.0 / 2)
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");

		else
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
	}
}