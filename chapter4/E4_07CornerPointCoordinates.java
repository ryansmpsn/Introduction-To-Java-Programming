package chapter4;
/*
 * Write a program that prompts
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon.
 * Created by Ryan Simpson /24/2019
 */
import java.util.*;

public class E4_07CornerPointCoordinates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		input.close();

		System.out.println("The coordinates of five points on the pentagon are");
		for (int i = 0; i < 5; i++) {

			double x = radius * Math.sin(2.0 * Math.PI / 5.0 * i);
			double y = radius * Math.cos(2.0 * Math.PI / 5.0 * i);
			System.out.println("(" + x + " " + y + ")");
		}

	}
}