package chapter2;

/*
 * Write a program that reads a number in feet, converts it
 * to meters, and displays the result.
 * 
 * 
 * Created by Ryan Simpson 7/6/18
 */

import java.util.*;

public class E2_03ConvertFeetToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number in feet to be converted to meters: ");

		Scanner input = new Scanner(System.in);

		double feet = input.nextDouble();
		double meters = feet * .305;
		input.close();

		System.out.println(feet + " feet is equal to " + meters + " meters.");
	}

}
