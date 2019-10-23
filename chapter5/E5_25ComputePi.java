package chapter5;
/*
 * Write a program that displays the p value for i = 10000, 20000, …, and 100000.
 * 
 * Created by Ryan Simpson 9/23/2019
 */

public class E5_25ComputePi {
	public static void main(String[] args) {

		double pi = 0;
		for (double i = 1; i <= 100000; i++) {
			pi += Math.pow(-1, i + 1) / (2 * i - 1);

			if (i == 10000) {
				System.out.println("Pi at i = 10,000: " + (pi * 4));

			}
			if (i == 20000) {
				System.out.println("Pi at i = 20,000: " + (pi * 4));

			}
			if (i == 100000) {
				System.out.println("Pi at i = 100,000: " + (pi * 4));

			}
		}
	}
}
