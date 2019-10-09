package chapter4;
/*
 * Write a program that receives an ASCII code
 * (an integer between 0 and 127) and displays its character.
 * 
 * Created by Ryan Simpson 9/24/2019
 */

import java.util.*;

public class E4_08ASCIICode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		int i = input.nextInt();
		
		System.out.println("The character for ASCII code " + i + " is " + (char)i);
		input.close();
	}

}
