package chapter2;
/*
 * Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off.
 * 
 * Created by Ryan Simpson 9/11/2018
 */

import java.util.*;
public class E2_12RunwayLength {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter speed: ");
		double speed = input.nextDouble();
		
		System.out.println("Enter acceleration: ");
		double acceleration = input.nextDouble() * 2;
		
		double length = (Math.pow(speed, 2) / acceleration);
		System.out.println("The minimum runway length for this airplane is " + length);
		input.close();
		
	}
}
