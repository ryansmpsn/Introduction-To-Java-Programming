package chapter4;
/*
 * Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area.
 * 
 * Created by Ryan Simpson 9/24/2019
 */

import java.util.Scanner;

public class E4_05AreaOfAPolygon {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of sides: ");
		double n = input.nextDouble();
		
		System.out.println("Enter the length: ");
		double length = input.nextDouble();

		double area = (n * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / n));

		System.out.printf("The area of the polygon is %.2f", + area);
		input.close();
	}
}