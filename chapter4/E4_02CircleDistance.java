package chapter4;
/*
 *Write a program that prompts the user to enter the latitude and longitude of two
 * points on the earth in degrees and displays its great circle distance.
 * 
 * Created by Ryan Simpson 9/24/2019
 */

import java.util.*;

public class E4_02CircleDistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		final double RADIUS = 6371.01;

		double distance = RADIUS * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))
				+ Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));

		System.out.println("The distance between the two points is " + distance + " km.");

		input.close();
	}
}
