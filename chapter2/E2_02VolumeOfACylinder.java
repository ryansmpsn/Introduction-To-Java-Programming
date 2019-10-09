package chapter2;

/*
 * Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume
 * 
 * Created by Ryan Simpson 7/6/18
 */
import java.util.*;

public class E2_02VolumeOfACylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and the length of a cylinder: ");

		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = radius * radius * 3.14;
		double volume = area * length;

		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
		input.close();
	}
}