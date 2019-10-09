package chapter3;
/*
 * Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 * 
 * Created By Ryan Simpson 9/18/2019
 */

import java.util.*;

public class E3_08SortThreeIntegers {
	public static void main(String[] args) {

		int int1, int2, int3, temp;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three numbers to be sorted in non-decreasing order");
		int1 = input.nextInt();
		int2 = input.nextInt();
		int3 = input.nextInt();
		input.close();

		if (int1 < int2) {
			temp = int1;
			int1 = int2;
			int2 = temp;
		}
		if (int2 < int3) {
			temp = int2;
			int2 = int3;
			int3 = temp;
		}
		if (int1 < int2) {
			temp = int1;
			int1 = int2;
			int2 = temp;
		}

		System.out.println(int3 + " " + int2 + " " + int1);
	}

}
