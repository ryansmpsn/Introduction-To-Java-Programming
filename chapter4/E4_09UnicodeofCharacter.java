package chapter4;
/*
 * Write a program that receives a character and
 * displays its Unicode.
 * Created by Ryan Simpson 9/24/2019
 */

import java.util.*;

public class E4_09UnicodeofCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");

		char ch = input.next().charAt(0);
		System.out.println("The Unicode for the Character " + ch + " is " + (int) ch);
		input.close();
	}
}
