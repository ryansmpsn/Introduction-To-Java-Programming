package chapter1;
/*
 * 
 * Write a program that displays the area and perimeter
 * of a circle that has a radius of 5.5.
 * 
 * Created by Ryan Simpson 7/6/18
 */

public class E1_08AreaOfACircle {
	public static void main(String[] args) {
		System.out.println("The perimeter of a circle with an area of 5.5 = "
				+ 2 * 5.5 * (4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13))));
		System.out.println("The area of a circle with an area of 5.5 = "
				+ 5.5 * 5.5 * (4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13))));
	}
}