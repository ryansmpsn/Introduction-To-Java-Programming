package chapter5;
/*
 * Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid.
 * 
 * Created by Ryan Simpson 10/2/2019
 */

import java.util.*;

public class E5_17DisplayPyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of lines: (1-15)");
		int lines = input.nextInt();

		for (int row = 1; row <= lines; row++) {
			System.out.println("");

			// creates spaces
			for (int s = lines - row; s >= 1; s--) {
				System.out.printf("%3s", "  ");
			}
			// displays ascending side of pyramid
			for (int a = row; a >= 1; a--) {
				System.out.printf("%3d", a);
			}
			// displays decending side of pyramid
			for (int d = 2; d <= row; d++) {
				System.out.printf("%3d", d);
			}
		}
		input.close();
	}
}
