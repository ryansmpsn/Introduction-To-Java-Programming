package chapter3;
/*
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 * has no real roots”.
 * 
 * Created by Ryan Simpson 9/22/2018
 */

import java.util.*;
public class E3_01QuadraticEquations {
	public static void main(String[] args) {
		
		double a, b, c, desc, r1, r2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, & c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		desc = Math.pow(b, 2) - 4 * a * c;
		
		if (desc >= 1){
			r1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, .5)) / 2 * a;
			r2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, .5)) / 2 * a;
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		}
		else if (desc == 0) {
			r1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, .5)) / 2 * a;
			System.out.println("The equation has one root " + r1);
		}
		else {
			System.out.println("The equation has no real roots.");
		}
		
		input.close();
	}

}
