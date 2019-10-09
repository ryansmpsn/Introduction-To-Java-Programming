package chapter2;

import java.util.Scanner;

/*
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month.
 * 
 * Created by Ryan Simpson 9/12/2018
 */
public class E2_20CalculateInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		input.close();
		
		double interest = balance * (interestRate / 1200);
		System.out.println("The interest is " + interest);
		
	}
}
