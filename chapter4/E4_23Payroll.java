package chapter4;

/*
 * Write a program that reads the following information
 * and prints a payroll statement:
 *    Employee’s name (e.g., Smith)
 *    Number of hours worked in a week (e.g., 10)
 *    Hourly pay rate (e.g., 9.75)
 *    Federal tax withholding rate (e.g., 20%)
 *    State tax withholding rate (e.g., 9%)
 * 
 * Created by Ryan Simpson 9/25/2019
 */

import java.util.*;

public class E4_23Payroll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name: ");
		String name  = input.next();
		
		System.out.println("Enter number of hours worked in a week: ");
		int hours = input.nextInt();
		
		System.out.println("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		double fedRate = input.nextDouble();
		
		System.out.println("Enter state tax withholding rate");
		double stateRate = input.nextDouble();
		input.close();
		
		double grossPay = (payRate * hours);
		double fedHold = fedRate * grossPay;
		double stateHold = stateRate * grossPay;
		double deduction = fedHold + stateHold;
		double netPay = grossPay - deduction;
		
		System.out.println("Employee's name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + payRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions:");
		System.out.println("\tFederal Withholding (" + fedRate * 100 + "%): "+  fedHold);
		System.out.println("\tState Withholding (" + stateRate * 100 + "%): " + stateHold);
		System.out.printf("\tTotal Deduction: $%.2f", + deduction);
		System.out.printf("\nNet Pay: $%.2f", + netPay);
	}

}
