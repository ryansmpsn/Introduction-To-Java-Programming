package chapter3;
/*
 * Write a program that randomly generates an integer between 1
 * and 12 and displays the English month name January, February, �, December for
 * the number 1, 2, �, 12, accordingly.
 * 
 * Created by Ryan Simpson 9/16/2019
 */

import java.util.Random;

public class E3_04RandomMonth {
	public static void main(String[] args) {

		Random random = new Random();
		int month = random.nextInt(12) + 1;

		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		}

	}
}
