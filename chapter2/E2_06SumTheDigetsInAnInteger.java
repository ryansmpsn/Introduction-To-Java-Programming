package chapter2;

/*
 * Write a program that reads an integer between 0 and
 * 1000 and adds all the digits in the integer.
 * 
 * 
 * Created by Ryan Simpson 7/6/18
 */

import java.util.*;
public class E2_06SumTheDigetsInAnInteger {

	public static void main(String[] args) {

		System.out.println("Enter an integer between 0 - 1000");
		
		Scanner input  = new Scanner(System.in);
		
		int number = input.nextInt();
		int total = 0;
		
		while (number > 0) {
			total = number % 10 + total;
			number = number / 10;
		}
		System.out.println("The sum of the digets is " + total);
		input.close();
	}

}
