package chapter5;
/*
 * Write a program
 * that lets the user enter the loan amount and loan period in number of years
 * and displays the monthly and total payments for each interest rate starting from
* 5% to 8%, with an increment of 1/8.
 *
 * Created by Ryan Simpson 10/8/2019
 */

import java.util.*;

public class E5_21FinancialApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Loan Amount: ");
		double loanAmount = input.nextDouble();

		System.out.println("Number of Years: ");
		int years = input.nextInt();

		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");

		for (double i = 5.0; i <= 8.0; i += .125) {
			double monthlyInterest = i / 1200;
			double monthlyPayment = loanAmount * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, years * 12));
			double totalPayment = monthlyPayment * years * 12;

			System.out.print(i + "%\t\t");
			System.out.printf("%.2f\t\t", monthlyPayment);
			System.out.printf("%.2f", totalPayment);
			System.out.println();
		}
		input.close();
	}
}
