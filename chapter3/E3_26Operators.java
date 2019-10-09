package chapter3;
/*
 * Write a program that prompts the user to enter
 * an integer and determines whether it is divisible by 5 and 6, whether it is divisible
 * by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 * 
 * Created by Ryan Simpson 9/20/2019
 */

import java.util.*;

public class E3_26Operators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int choice = input.nextInt();
		input.close();
		
		boolean divAnd = (choice % 5 == 0) && (choice % 6 ==0);
		boolean divOr = (choice % 5 == 0) || (choice % 6 ==0);
		boolean divOne = (choice % 5 == 0) ^ (choice % 6 ==0); 
		
		System.out.println("Is " + choice + " divisible by 5 and 6? " + divAnd);
		
		System.out.println("Is " + choice + " divisible by 5 or 6? " + divOr);
		
		System.out.println("Is " + choice + " divisible by 5 or 6, but not both? " + divOne);
		
		
	}
}
