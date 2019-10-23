package chapter5;
/*
 * Write a program to sum the following series:
 * 
 * Created by Ryan Simpson 10/22/2019
 */

public class E5_24SumASeries {
	public static void main(String[] args) {

		double sum = 0;

		for (double i = 1; i <= 97; i += 2)
			sum += (i / (i + 2));

		System.out.println("Sum of series: " + sum);
	}
}
