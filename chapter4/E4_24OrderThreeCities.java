package chapter4;
/*
 * Write a program that prompts the user to enter three cities and
 * displays them in ascending order.
 * Created by Ryan Simpson 9/25/2019
 */

import java.util.*;

public class E4_24OrderThreeCities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first city: ");
		String s1 = input.nextLine();

		System.out.println("Enter the second city: ");
		String s2 = input.nextLine();

		System.out.println("Enter the third city: ");
		String s3 = input.nextLine();
		input.close();

		String temp;
		if (s1.compareTo(s2) > 0) {
			temp = s1;
			s1 = s2;
			s2 = temp;
		}
		if (s2.compareTo(s3) > 0) {
			temp = s2;
			s2 = s3;
			s3 = temp;
		}
		if (s1.compareTo(s2) > 0) {
			temp = s1;
			s1 = s2;
			s2 = temp;
		}

		System.out.println("The three cities in alphabetical order are " + s1 + " " + s2 + " " + s3);

	}
}
