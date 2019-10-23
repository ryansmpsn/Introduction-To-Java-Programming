package chapter5;
/*
 * Write a program that compares the results of the summation of the preceding
 * series, computing from left to right and from right to left with n = 50000.
 * 
 * Created by Ryan Simpson 10/22/2019
 */

public class E5_23CancellationErrors {

	public static void main(String[] args) {
		double sumLeftToRight = 0.0;
		for (double i = 1.0; i <= 50000.0; i++) {
			sumLeftToRight += 1 / i;
		}

		System.out.println("Summation of series left to right: " + sumLeftToRight);

		double sumRightToLeft = 0.0;
		for (double i = 50000.0; i >= 1.0; i--) {
			sumRightToLeft += 1 / i;
		}

		System.out.println("Summation of series right to left: " + sumRightToLeft);

		System.out.println("Summation of the series right to left - " + "Summation of the series left to right: "
				+ (sumRightToLeft - sumLeftToRight));
	}

}