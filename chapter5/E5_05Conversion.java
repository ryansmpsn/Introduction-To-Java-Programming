package chapter5;
/*
 * Write a program that displays the following two tables side by side:
 * Kilograms Pounds | Pounds Kilograms
 * 
 * Created by Ryan Simpson 10/2/1019
 */

public class E5_05Conversion {
	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds\t|\tKilograms\tPounds");
		int kilo = 20;
		for (int i = 1; i <= 200; i += 2) {
			System.out.printf("\n" + i + "\t\t%.1f", +i * 2.2);
			System.out.printf("\t|\t" + kilo + "\t\t%.2f", +kilo / 2.2);
			kilo += 5;
		}
	}
}
