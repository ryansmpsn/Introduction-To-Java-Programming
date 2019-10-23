package chapter5;
/*
 * Write a program that displays the e value for i = 10000, 20000, …, and 100000.
 *
 * Created by Ryan Simpson 10/23/2019
 */

public class E5_26Computee {
	public static void main(String[] args) {
		double e = 1, item = 1;
		for (double i = 1; i <= 100000; i++) {
			item = item / i;
			e += item;

			if (i == 10000) {
				System.out.println("e at i = 10,000: " + e);

			}
			if (i == 20000) {
				System.out.println("e at i = 20,000: " + e);

			}
			if (i == 100000) {
				System.out.println("e at i = 100,000: " + e);

			}
		}
	}

}
