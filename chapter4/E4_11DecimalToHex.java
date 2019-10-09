package chapter4;
/* 
 * Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number.
 * 
 * Created by Ryan Simpson 9/24/2019
 */

import java.util.*;

public class E4_11DecimalToHex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a i value 0 to 15 : ");
		int i = input.nextInt();
		
		if (i >= 0 && i <= 9)
			System.out.println("The hex value is " + i);
		else if (i >= 10 && i <= 15)
			System.out.println("The hex value is " + (char)(i + 'A' - 10));
		else
			System.out.println(i + " is an invalid input");
		input.close();
		
	}

}
