package chapter4;
/*
 * Write a program that prompts the user to enter a Social Security
 * number in the format DDD-DD-DDDD, where D is a digit. Your program should
 * check whether the input is valid.
 * Created by Ryan Simpson 9/25/2019
 */

import java.util.*;

public class E4_21CheckSSN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Social Security number (DD-DD-DDDD) : ");
		String s = input.next();
		input.close();

		if (Integer.parseInt(s.substring(0, 2)) >= 0 && Integer.parseInt(s.substring(0, 2)) <= 99) {
			System.out.println(s + " is an invalid social security number.");
			if (Integer.parseInt(s.substring(3, 5)) >= 0 && Integer.parseInt(s.substring(3, 5)) <= 99) {
				System.out.println(s + " is an invalid social security number.");
				if (Integer.parseInt(s.substring(6, 10)) >= 0 && Integer.parseInt(s.substring(6, 10)) <= 9999) {
					System.out.println(s + " is a valid social security number.");
				}
			}
		} else
			System.out.println(s + " is an invalid social security number.");
	}
}