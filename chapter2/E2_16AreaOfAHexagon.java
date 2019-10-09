package chapter2;
/*
 * Write a program that prompts the user to enter the
 * side of a hexagon and displays its area.
 * 
 * Created by Ryan Simpson
 */

import java.util.*;
public class E2_16AreaOfAHexagon {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side: ");
		double s = input.nextDouble();
		input.close();
		
		double area = ((3 * Math.pow(3, .5)) / 2) * Math.pow(s, 2); 
		System.out.println("The area of the hexagon is " + area);
	}
}
