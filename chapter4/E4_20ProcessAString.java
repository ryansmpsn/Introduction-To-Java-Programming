package chapter4;
/*
 * 
 * Created by Ryan Simpson 9/25/2019
 */

import java.util.*;

public class E4_20ProcessAString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.next();
		
		System.out.println("The length of the string is " + s.length());
		System.out.println("The first character of the string is " + s.charAt(0));
		input.close();
	}

}
