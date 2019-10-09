package chapter3;
/*
 * Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10.
 * 
 * Created by Ryan Simpson9/20/2019
 */

import java.util.*;

public class E3_22PointInACircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int RADIUS = 10;

		System.out.println("Enter a point with two coordinates: ");
		int x = input.nextInt();
		int y = input.nextInt();
		input.close();

		if (Math.pow(x * x + y * y, 0.5D) <= RADIUS) 
			System.out.println("Point (" + x + ", " + y + ") is in the circle.");
		 
		else 
			System.out.println("Point (" + x + ", " + y + ") is not in the circle.");		
	}
}