package chapter3;
/*
 * Write a program that prompts the user
 * to enter the three points for p0, p1, and p2 and displays whether p2 is on the line
 * segment from p0 to p1.
 * 
 * Created by Ryan Simpson 9/20/2019
 */

import java.util.*;

public class E3_34PointOnALineSegment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		boolean isLineSegment = (position <= 0)
				&& (((x0 <= x2) && (x2 <= x1)) || ((x0 >= x2) && (x2 >= x1)));
		
		if (isLineSegment) {
			System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from " + " (" + x0 + ", " + y0 + ") to "
					+ "(" + x1 + ", " + y1 + ")");
		} 
		else {
			System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from" + " (" + x0 + ", " + y0
					+ ") to " + "(" + x1 + ", " + y1 + ")");
		}

		input.close();

	}
}
