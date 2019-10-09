package chapter2;
/*
 * Write a program that prompts the user to enter the distance to
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
 * and displays the cost of the trip.
 * 
 * Created by Ryan Simpson 9/12/2018
 */
import java.util.*;
public class E2_23CostOfDriving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double distance, mpg, ppg, cost;
		
		System.out.println("Enter the driving distance: ");
		distance = input.nextDouble();;
		
		System.out.println("Enter miles per gallon: ");
		mpg = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		ppg = input.nextDouble();
		
		cost = distance / mpg * ppg;
		System.out.println("The cost of driving is$ " + cost);
		input.close();		
	}

}
