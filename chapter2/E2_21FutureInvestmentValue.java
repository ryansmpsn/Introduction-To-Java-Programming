package chapter2;
/*
 * Write a program that reads in investment amount,
 * annual interest rate, and number of years, and displays the future investment value.
 * 
 * Created by Ryan Simpson 9/12/2018
 */

import java.util.*;
public class E2_21FutureInvestmentValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double futureInvestmentValue, investmentAmount, years, interestRate;
		System.out.println("Enter investment amount: ");
		investmentAmount = input.nextDouble();
		
		System.out.println("Enter annual interest rate in percentage: ");
		interestRate = input.nextDouble() *.01;
		
		System.out.println("Enter number of years: ");
		years = input.nextDouble();
		
		futureInvestmentValue = investmentAmount * Math.pow(1 + interestRate / 12 , years * 12);
		System.out.println("Accumulated value is $" + futureInvestmentValue);
		input.close();
	}
}
