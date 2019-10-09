package chapter2;

/*
 * Write a program that reads a number in feet, converts it
 * to meters, and displays the result.
 * 
 * 
 * Created by Ryan Simpson 7/6/18
 */

import java.util.*;

public class E2_04ConvertPoundsToKilograms {

	public static void main(String[] args) {

		System.out.println("Enter the amount of pounds to be converterd to kilograms: ");
		
		Scanner input = new Scanner(System.in);
		
		double pounds = input.nextDouble();
		double kilograms = pounds * .454;
		
		System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
		
		input.close();
		
	}

}
