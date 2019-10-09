package chapter2;
/*
 * Write a program that prompts the user to enter
 * two points (x1, y1) and (x2, y2) and displays their distance between them.
 * 
 * Created by Ryan Simpson
 */

import java.util.*;
public class E2_15DistanceOfPoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x1, y1, x2, y2, distance;
		System.out.println("Enter x1 and y1: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		System.out.println("Enter x2 and y2: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), .5);
		System.out.println("The distance between the two points is " + distance);
		input.close();
	}
}
