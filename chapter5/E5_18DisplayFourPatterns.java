package chapter5;

/*
 * Use nested loops that display the following patterns in four separate programs.
 * 
 * Created by Ryan Simpson 10/2/2019
 */
public class E5_18DisplayFourPatterns {
	public static void main(String[] args) {

		// Pattern A
		System.out.println("Pattern A");
		for (int index = 1; index <= 6; index++) {
			for (int a = 1; a - index <= 0; a++)
				System.out.print(a + " ");
			System.out.println("");

		}

		// Pattern B
		System.out.println("\nPattern B");
		for (int index = 6; index > 0; index--) {
			for (int b = 1; b - index <= 0; b++)
				System.out.print(b + " ");
			System.out.println("");

		}
		// Pattern C
		System.out.println("\nPattern C");
		for (int index = 0; index <= 5; index++) {
			for (int c = 0; c <= 4 - index; c++)
				System.out.print("  ");

			for (int j = index + 1; j >= 1 ; j--)
				System.out.print(j + " ");
			System.out.println();
		}
		// Pattern D
		System.out.println("\nPattern D");
		for (int index = 0; index < 6; index++) {
			for (int e = 0; e < index; e++)
				System.out.print("  ");
			for (int d = 0 ; d < 6 - index; d++)
				System.out.print((d + 1) + " ");
			System.out.println();
		}
	}

}
