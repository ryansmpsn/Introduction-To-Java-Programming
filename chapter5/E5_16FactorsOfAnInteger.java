package chapter5;
/*
 * Write a program that reads an integer and displays
 * all its smallest factors in increasing order.
 * Created by Ryan Simpson 10/2/2019
 */

import java.util.*;

public class E5_16FactorsOfAnInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int number = input.nextInt();

		for (int i = 2; i <= number;) {
			if (number % i == 0) {
				number /= i;
				System.out.print(i + ", ");
			} else
				i++;
		}
		input.close();
	}
}