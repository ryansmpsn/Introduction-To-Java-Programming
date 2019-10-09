package chapter5;
/*
 * Write a program that displays the following table:
 * 
 * Kilograms   Pounds
 * 1           2.2
 * 3           6.6
 * --          --
 * 199         437.8
 * 
 * Created by Ryan Simpson 10/2/2019
 */

public class E5_03Conversion {
	public static void main(String[] args) {

		System.out.println("Kilograms \tPounds");
		for (int i = 1; i < 200;) {
			System.out.printf("\n" + i + "\t\t%.1f", +i * 2.2);
			i++;
			i++;
		}
	}
}
