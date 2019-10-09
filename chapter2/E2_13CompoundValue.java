package chapter2;
/*
 * Write a program that prompts the user to enter a monthly saving amount and
 * displays the account value after the sixth month.
 * 
 * Created by Ryan Simpson 9/11/2018
 */

import java.util.*;
public class E2_13CompoundValue {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the monthly saving amount: ");
		double monthly = input.nextDouble();
		
		input.close();
		int i = 0;
				
		while(i <= 5){
			if(i == 1) {
				monthly = monthly * (1.0 + 0.00417);
			}
			else {
				monthly = ((100 + monthly) * (1.0 + 0.00417));
			}
			i++;
		}
		
		System.out.println("After the sixth month, the account value is $" + monthly);
		
		
	}

}
