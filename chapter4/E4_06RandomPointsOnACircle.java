package chapter4;
/*
 * Write a program that generates three random points
 * on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
 * formed by these three points.

 * Created by Ryan Simpson 9/24/2019
 */

public class E4_06RandomPointsOnACircle {
	public static void main(String[] args) {

		final double RADIUS = 40;
		// Generate random angle in radians between 0 and 2PI
		double angle1 = (Math.random() * (2 * Math.PI));
		double angle2 = (Math.random() * (2 * Math.PI));
		double angle3 = (Math.random() * (2 * Math.PI));

		double x1 = RADIUS * Math.cos(angle1);
		double y1 = RADIUS * Math.sin(angle1);
		double x2 = RADIUS * Math.cos(angle2);
		double y2 = RADIUS * Math.sin(angle2);
		double x3 = RADIUS * Math.cos(angle3);
		double y3 = RADIUS * Math.sin(angle3);

		// Compute three sides
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		// Compute three angles
		double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c)
			/ (-2 * b * c)));
		double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c)
			/ (-2 * a * c)));
		double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a)
			/ (-2 * a * b)));

		System.out.println("The three angles are " +
			Math.round(angleA * 100) / 100.0 + " " +
			Math.round(angleB * 100) / 100.0 + " " +
			Math.round(angleC * 100) / 100.0);

	}

}
