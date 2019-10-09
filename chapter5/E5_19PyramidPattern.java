package chapter5;

/*
 * Write a nested for loop that prints the following output:
 * 
 * Created by Ryan Simpson 10/7/2019
 */
public class E5_19PyramidPattern {

	public static void main(String[] args) {
		int right = 0, whiteSpace = 7;
		for (int row = 1; row <= 128; row += row) {
			for (int start = 0; start < whiteSpace; start++) {
				System.out.print("    ");
			}
			for (int i = 1; i <= row; i += i) {
				System.out.printf("%4d", (i));
			}
			for (int r = right; r > 0; r /= 2) {
				System.out.printf("%4d", (r));
			}
			System.out.println();
			whiteSpace--;
			right = row;
		}

	}

}
