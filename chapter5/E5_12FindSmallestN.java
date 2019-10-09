package chapter5;
/*
 *Use a while loop to find the smallest integer n such that n2 is greater than 12,000. 
 * 
 * Created by Ryan Simpson 10/2/2019
 */

public class E5_12FindSmallestN {
	public static void main(String[] args) {
		int i = 1;
		while (Math.pow(i, 2) < 12000) {
			i++;
		}
		System.out.println("The smallest integer n such that n^2 is greater than 12,000: " + i);

	}
}
