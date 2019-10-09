package chapter3;
/*
 * Write a program that prompts the user to enter to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
 * that “The equation has no solution.”
 * 
 * Created by Ryan Simpson 9/16/2019
 */

import java.util.*;

public class E3_03LinearEquations {
	public static void main(String[] args) {

		double a, b, c, d, e, f, x, y, ad, bc;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter values for a, b, c, d, e and f.");

		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		ad = a * d;
		bc = b * c;

		if (ad - bc == 0.0) {
			System.out.println("The equation has no solution.");
		} else {
			x = ((e * d) - (b * f)) / ((a * d) - (b * c));
			y = ((a * f) - (e * c)) / ((a * d) - (b * c));

			System.out.println("x = " + x + " and y = " + y);
			input.close();
		}
	}

}
