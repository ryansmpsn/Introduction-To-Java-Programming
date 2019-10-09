package chapter5;
/*
 * Write a program that computes the tuition in ten years and the
 * total cost of four years’ worth of tuition after the tenth year.
 *
 * Created By Ryan Simpson 10/2/2019
 */

public class E5_07ComputeFutureTuition {
	public static void main(String[] args) {
		double tuition = 10000;
		double totalCost = 0;

		for (int i = 0; i < 14; i++) {
			tuition += (tuition * 0.05);
			if (i == 9) {
				System.out.print("Tuition after 10 years is $");
				System.out.printf("%.2f", tuition);
			}
			if (i >= 10)
				totalCost += tuition;
			if (i == 13)
				System.out.print("\nThe total cost for four years worth of tuition after the 10th year is $");
		}

		System.out.printf("%.2f", totalCost);
	}
}