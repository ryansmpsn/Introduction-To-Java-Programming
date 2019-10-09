package chapter2;

/*
 * Write a program that reads a Celsius degree in
 * a double value from the console, then converts it to Fahrenheit and displays the result.
 * 
 * 
 * Created by Ryan Simpson 7/6/18
 */
import java.util.*;

public class E2_01ConvertCelsiusToFahrenheit {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the degree in Celsius to be converted to Farenheit:");
		
		double celsius = input.nextDouble();
		input.close();
		double fahrenheit = (9.0 / 5.0) * celsius + 32.0;

        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " Fahrenheit.");
		
		
	}
}