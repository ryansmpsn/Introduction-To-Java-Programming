package chapter2;

/*
 * Write a program that reads the subtotal 
 * and the gratuity rate, then computes the gratuity and total.
 * 
 * 
 * Created by Ryan Simpson 7/6/18
 */

import java.util.*;

public class E2_05CalculateTips {

	public static void main(String[] args) {
		
		System.out.println("Enter the subtotal: ");
		
		Scanner input = new Scanner(System.in);
		double subtotal = input.nextDouble();
		
		System.out.println("Enter gratuity rate: ");
		double gratuityRate = input.nextDouble() * .01;
		double gratuity = subtotal * gratuityRate;
		double total = gratuity + subtotal;
		
		System.out.println("Your total gratuity is $" + gratuity + ", and your total is $" + total + ".");
		input.close();

	}

}
