package chapter5;
/*
 * 
 * 
 * Created by Ryan Simpson 9/27/2019
 */

import java.util.*;

public class E5_01CountNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		int pos = 0;
		int neg = 0;
		int total = 0;
		
		for (int i = 1; i != 0;) {
			i = input.nextInt();
			if (i > 0)
				pos++;
			else if (i < 0)
				neg++;
			total += i;
		}
		if (neg + pos == 0) {
			System.out.println("No numbers are entered except 0.");
		}
		input.close();
		
		double average = total / (double) (pos + neg);
		
		System.out.println("The number od positives is " + pos);
		System.out.println("The number of negatives is " + neg);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
	}
}
