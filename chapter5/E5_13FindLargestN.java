package chapter5;
/*
 * Use a while loop to find the largest integer n such that n3 is less than 12,000.
 * 
 * Created by Ryan Simpson 10/2/2019
 */

public class E5_13FindLargestN {
	public static void main(String[] args) {
		int i = 0;
		while (12000 > Math.pow(i, 3)) {
			i++;
		}
		System.out.println("The largest integer n such that n^3 is less than 12,000 is : " + i);
	}
}