package chapter3;
/*
 * Write a program that prompts the user to enter the
 * center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the first
 * Created by Ryan Simpson 9/20/2019
 */

import java.util.*;

public class E3_28TwoRectangles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double oneWidth = input.nextDouble();
		double oneHeight = input.nextDouble();
		
		System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double twoWidth = input.nextDouble();
		double twoHeight = input.nextDouble();
		
        double xDistance = x1 >= x2 ? x1 - x2 : x2 - x1;
        double yDistance = y1 >= y2 ? y1 - y2 : y2 - y1;

        boolean r2IsInR1 = (xDistance <= (oneWidth - twoWidth) / 2 && yDistance <= (oneHeight - twoHeight) / 2);
        boolean r2OverlapR1 = (xDistance <= (oneWidth + twoWidth) / 2 && yDistance <= (oneHeight + twoHeight) / 2);

        if (r2IsInR1) {
            System.out.println("r2 is inside r1");
        } else if (r2OverlapR1) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }
		
        input.close();
	}

}
