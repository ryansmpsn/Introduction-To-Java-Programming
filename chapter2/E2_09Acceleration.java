package chapter2;
/*
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * and displays the average acceleration.
 * 
 * Created by Ryan Simpson 9/9/2018
 */

import java.util.*;
public class E2_09Acceleration {

	public static void main(String[] args) {

				System.out.println("Please enter v0, v1, & t: ");
				
				Scanner input = new Scanner(System.in);
				
				double v0 = input.nextDouble();
				double v1 = input.nextDouble();
				double t = input.nextDouble();
				
				double a = ((v1 - v0) / t);
				input.close();
				
				System.out.println("The average acceleration is " + a);
				
				
				
			
		}
	}

