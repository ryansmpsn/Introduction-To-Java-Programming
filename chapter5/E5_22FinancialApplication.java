package chapter5;
/*
 * Write a program that lets the user enter the loan amount,
 * number of years, and interest rate and displays the amortization schedule for the loan.
 * 
 * Created by Ryan Simpson 10/22/2019
 */

import java.util.*;

public class E5_22FinancialApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double annualRate = input.nextDouble();
		input.close();

		double monthlyRate = annualRate / 1200;

		double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));

		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);

		System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * years);

		double balance = loanAmount, principal, interest;
		System.out.println("Payment#     Interest     Principal     Balance");
		for (int i = 1; i <= years * 12; i++) {
			interest = monthlyRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance);
		}
	}
}