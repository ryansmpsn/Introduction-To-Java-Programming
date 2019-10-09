package chapter1;
/*
 * 
 * Pie can be computed using the following formula:
 * 
 * Created by Ryan Simpson 7/6/18
 */

public class E1_07ApproximatePie {
	public static void main(String[] args) {
		System.out.println(4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
		System.out.println(4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));

	}
}