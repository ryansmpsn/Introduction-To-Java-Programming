package chapter3;
/*
 * Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 * 
 * Created by Ryan Simpson 9/19/2019
 */

public class E3_16RandomPoint {
	public static void main(String[] args) {

		double x = (int) (Math.random() * 51 * 2 - 51);
		double y = (int) (Math.random() * 100 * 2 - 100);

		System.out.println("(" + x + " , " + y + ")");
	}
}