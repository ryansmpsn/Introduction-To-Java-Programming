package chapter5;
/* 
 * Write a program that displays the following
 * table (note that 1 mile is 1.609 kilometers).
 * 
 * Created by Ryan Simpson 10/2/2019
 */

public class E5_04Conversion {
	public static void main(String[] args) {
		System.out.println("Miles \tKilometers");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\t" + i * 1.609);
		}
	}

}
