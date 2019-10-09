package chapter2;
/*
 * Write a program that prompts the user to enter
 * three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 * 
 * Created by Ryan Simpson 9/12/2018
 */

import java.util.*;
public class E2_19AreaOfATriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x1, x2, x3, y1, y2, y3, side1, side2, side3, s, area;
		System.out.println("Enter x1 and y1: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.println("Enter x2 and y2: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		System.out.println("Enter x3 and y3: ");
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		input.close();
		
		side1 = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
        side2 = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3), 0.5);
        side3 = Math.pow((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2), 0.5);
		s = (side1 + side2 + side3) / 2;
		area = Math.pow(s * (s - side1) *(s - side2) * (s - side3) , .5);
		System.out.println("The area of the triangle is " + area);
	}
}
