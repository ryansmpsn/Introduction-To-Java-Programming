package chapter5;
/*
 * Write a program that displays the following two tables side by side:
 * Miles Kilometers | Kilometers Miles
 * 
 * Created by Ryan Simpson 10/2/2019
 */

public class E5_06Conversion {
	public static void main(String[] args) {
		System.out.println("Miles \tKilometers\t|\tKilometers\tMiles");
		for (int i = 1, k = 20; i <= 10; i++, k += 5) {
			System.out.printf("\n" + i + "\t" + i * 1.609 + "\t\t|\t" + k + "\t%.3f", +k / 1.609);
		}
	}
}
